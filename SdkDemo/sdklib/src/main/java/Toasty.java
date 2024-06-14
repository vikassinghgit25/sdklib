import android.content.Context;
import android.widget.Toast;

public class Toasty {
    public static void showToast(Context context){
        Toast.makeText(context, "Yeahhhh toast print", Toast.LENGTH_SHORT).show();
    }
}
