package collegework.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    Button bttn;
    EditText op1,op2,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void operate(View view)
    {
        op1=(EditText)findViewById(R.id.operand1);
        op2=(EditText)findViewById(R.id.operand2);
        ans=(EditText)findViewById(R.id.answer);
        bttn=(Button)findViewById(view.getId());
        String answer="";
        ans.setText("Ans: ");
        if(bttn.getId()==R.id.plus){

            answer=ans.getText().toString();
            answer=answer+Integer.toString(Integer.parseInt(op1.getText().toString())+Integer.parseInt(op2.getText().toString()));
            ans.setText(answer);
        }
        else if(bttn.getId()==R.id.minus)
        {
            answer=ans.getText().toString();
            answer=answer+Integer.toString(Integer.parseInt(op1.getText().toString())-Integer.parseInt(op2.getText().toString()));
            ans.setText(answer);
        }
        else if(bttn.getId()==R.id.multiply)
        {
            answer=ans.getText().toString();
            answer=answer+Integer.toString(Integer.parseInt(op1.getText().toString())*Integer.parseInt(op2.getText().toString()));
            ans.setText(answer);
        }
    }
}
