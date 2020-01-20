package com.example.androidtask.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtask.Adapter.MainAdapter;
import com.example.androidtask.R;
import com.example.androidtask.model.Employee;
import com.example.androidtask.model.JobResponse;
import com.example.androidtask.request.Request;
import com.example.androidtask.request.RequestHeader;
import com.example.androidtask.rest.ApiInterface;
import com.example.androidtask.rest.ServiceGenerator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.main_recyclerview)
    RecyclerView main_recyclerview;

    private MainAdapter mainAdapter;
    private List<Employee> employees = new ArrayList<Employee>();

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unbinder = ButterKnife.bind(this);

        main_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        mainAdapter = new MainAdapter(employees, getApplicationContext());
        main_recyclerview.setAdapter(mainAdapter);

        getJobData();
    }

    private void getJobData() {

        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setAppLanguage(1);
        requestHeader.setAppversion("1.0");
        requestHeader.setCountryId(1);
        requestHeader.setCurrencyId(0);
        requestHeader.setDeviceSerial("drc-Scbc_ok:APA91bEA5_n4Jn7xQpUAyDI4xisaCUyzCx-66zoeG-m7Dh5Y8TsRPHxvJb6mTrtQp_g7qcpCV1ZcaF6ytqJ0t7XCCkfB7om_6dPxGtVBeGliI6rpCNZq-peDK7CvhL2RutuBr31_cBUo");
        requestHeader.setNotificationToken("drc-Scbc_ok:APA91bEA5_n4Jn7xQpUAyDI4xisaCUyzCx-66zoeG-m7Dh5Y8TsRPHxvJb6mTrtQp_g7qcpCV1ZcaF6ytqJ0t7XCCkfB7om_6dPxGtVBeGliI6rpCNZq-peDK7CvhL2RutuBr31_cBUo");
        requestHeader.setDeviceType(2);
        requestHeader.setOsversion("Device model: SM-N950F ,Android version: 9 , Api level: 28");
        requestHeader.setIp("");
        requestHeader.setIsWeb(false);
        requestHeader.setUserId(0);
        requestHeader.setUserType(1);

        List<Object> emptyList = new ArrayList<>();
        Request request = new Request();
        request.setRequestHeader(requestHeader);
        request.setYearExperienceFrom(0);
        request.setYearExperienceTo(0);
        request.setSalaryFrom(0);
        request.setSalaryTo(0);
        request.setId(0);
        request.setPaging(0);
        request.setPageSource(1);
        request.setEmployeerId(0);
        request.setEmploymentTypeId(0);
        request.setJobVacancyIndustry(emptyList);
        request.setJobVacancyCarrerLevels(emptyList);
        request.setJobVacancyLocation(emptyList);
        request.setJobVacancyPreferredDegree(emptyList);
        request.setJobVacancyPreferredLanguage(emptyList);
        request.setJobVacancyPreferredNatinality(emptyList);
        request.setJobVacancySkills(emptyList);

        ApiInterface apiInterface = ServiceGenerator.builder(ApiInterface.class);
        Call<JobResponse> call = apiInterface.getEmployee(request);
        call.enqueue(new Callback<JobResponse>() {
            @Override
            public void onResponse(Call<JobResponse> call, Response<JobResponse> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, "success");
                    employees.addAll(response.body().getEmployeeList());
                    mainAdapter.notifyDataSetChanged();
                } else {
                    Log.e(TAG, response.message());
                }
            }

            @Override
            public void onFailure(Call<JobResponse> call, Throwable t) {
                Log.e(TAG, t.getMessage());
            }
        });
    }
}
