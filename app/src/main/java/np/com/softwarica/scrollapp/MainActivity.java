package np.com.softwarica.scrollapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etMake, etColor, etYear, etPrice, etEngineSize;
    private TextView tvOutput;
    private Button btnCreateCar;
    private Car car;
    private int carCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMake = findViewById(R.id.etMake);
        etColor = findViewById(R.id.etColor);
        etYear = findViewById(R.id.etYear);
        etPrice = findViewById(R.id.etPrice);
        etEngineSize = findViewById(R.id.etEngineSize);
        tvOutput = findViewById(R.id.tvOutput);
        btnCreateCar = findViewById(R.id.btnCreateCar);

        btnCreateCar.setOnClickListener(this);
        tvOutput.setMovementMethod(new ScrollingMovementMethod());
    }

    @Override
    public void onClick(View view) {
        if(!validate()){
            return;
        }
        String make = etMake.getText().toString();
        String color = etColor.getText().toString();
        int year = Integer.parseInt(etYear.getText().toString());
        float price = Float.parseFloat(etPrice.getText().toString());
        float size = Float.parseFloat(etEngineSize.getText().toString());

        car = new Car(make, color, year, price, size);
        carCount++;
        tvOutput.append(Html.fromHtml("<b> <font color='#008577'>This is vehicle no." + carCount + "</font></b><br>"));
        tvOutput.append(Html.fromHtml(car.createCar()));
        tvOutput.append("\n\n");

    }

    private boolean validate(){
        if(TextUtils.isEmpty(etMake.getText().toString())){
            etMake.setError("Please enter maker!!!");
            etMake.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etColor.getText().toString())){
            etColor.setError("Please enter color!!!");
            etColor.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etYear.getText().toString())){
            etYear.setError("Please enter year!!!");
            etYear.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etPrice.getText().toString())){
            etPrice.setError("Please enter price!!!");
            etPrice.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etEngineSize.getText().toString())){
            etEngineSize.setError("Please enter engine size!!!");
            etEngineSize.requestFocus();
            return false;
        }
        return true;
    }
}
