package androidx.credentials.playservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class HiddenActivity extends Activity {
    public static final /* synthetic */ int c = 0;
    public ResultReceiver a;
    public boolean b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        tb2 tb2Var = yb2.a;
        tb2.b(resultReceiver, str, str2);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            tb2 tb2Var = yb2.a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", false);
            bundle.putInt("ACTIVITY_REQUEST_CODE", i);
            bundle.putParcelable("RESULT_DATA", intent);
            resultReceiver.send(i2, bundle);
        }
        this.b = false;
        finish();
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [kh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [iwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [wwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [wwd, java.lang.Object] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (!this.b) {
            if (stringExtra != null) {
                Task task = null;
                switch (stringExtra.hashCode()) {
                    case -441061071:
                        if (stringExtra.equals("BEGIN_SIGN_IN")) {
                            fk0 fk0Var = (fk0) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (fk0Var != null) {
                                vvd vvdVar = new vvd(this, (wwd) new Object());
                                new bk0(false, null, null, true, null, null, false);
                                bk0 bk0Var = fk0Var.b;
                                am8.s(bk0Var);
                                ek0 ek0Var = fk0Var.a;
                                am8.s(ek0Var);
                                dk0 dk0Var = fk0Var.f;
                                am8.s(dk0Var);
                                ck0 ck0Var = fk0Var.C;
                                am8.s(ck0Var);
                                fk0 fk0Var2 = new fk0(ek0Var, bk0Var, vvdVar.l, fk0Var.d, fk0Var.e, dk0Var, ck0Var, fk0Var.D);
                                uu5 b = uu5.b();
                                b.d = new mb4[]{new mb4("auth_api_credentials_begin_sign_in", 8L)};
                                b.c = new bp9(vvdVar, fk0Var2);
                                b.a = false;
                                b.b = 1553;
                                task = vvdVar.b(0, b.a()).addOnSuccessListener(new q6(new b65(this, intExtra, 0), 27)).addOnFailureListener(new OnFailureListener(this) { // from class: a65
                                    public final /* synthetic */ HiddenActivity b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // com.google.android.gms.tasks.OnFailureListener
                                    public final void onFailure(Exception exc) {
                                        int i = r2;
                                        String str = "CREATE_INTERRUPTED";
                                        String str2 = "GET_INTERRUPTED";
                                        HiddenActivity hiddenActivity = this.b;
                                        switch (i) {
                                            case 0:
                                                int i2 = HiddenActivity.c;
                                                exc.getClass();
                                                str = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "CREATE_UNKNOWN" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver2 = hiddenActivity.a;
                                                resultReceiver2.getClass();
                                                hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                                return;
                                            case 1:
                                                int i3 = HiddenActivity.c;
                                                exc.getClass();
                                                str = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "CREATE_UNKNOWN" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver3 = hiddenActivity.a;
                                                resultReceiver3.getClass();
                                                hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                                return;
                                            case 2:
                                                int i4 = HiddenActivity.c;
                                                exc.getClass();
                                                str2 = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "GET_NO_CREDENTIALS" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver4 = hiddenActivity.a;
                                                resultReceiver4.getClass();
                                                hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                                return;
                                            default:
                                                int i5 = HiddenActivity.c;
                                                exc.getClass();
                                                str2 = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "GET_NO_CREDENTIALS" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver5 = hiddenActivity.a;
                                                resultReceiver5.getClass();
                                                hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                                return;
                                        }
                                    }
                                });
                            }
                            if (task == null) {
                                Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                    case 15545322:
                        if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                            y99 y99Var = (y99) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra2 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (y99Var != null) {
                                s6f s6fVar = xb4.l;
                                ?? obj = new Object();
                                Looper mainLooper = getMainLooper();
                                am8.t(mainLooper, "Looper must not be null.");
                                tz4 tz4Var = new tz4(this, this, s6fVar, xs.g, new sz4(obj, mainLooper));
                                uu5 b2 = uu5.b();
                                b2.c = new xk9(17, tz4Var, y99Var);
                                b2.b = 5407;
                                task = tz4Var.b(0, b2.a()).addOnSuccessListener(new q6(new b65(this, intExtra2, 2), 24)).addOnFailureListener(new OnFailureListener(this) { // from class: a65
                                    public final /* synthetic */ HiddenActivity b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // com.google.android.gms.tasks.OnFailureListener
                                    public final void onFailure(Exception exc) {
                                        int i = r2;
                                        String str = "CREATE_INTERRUPTED";
                                        String str2 = "GET_INTERRUPTED";
                                        HiddenActivity hiddenActivity = this.b;
                                        switch (i) {
                                            case 0:
                                                int i2 = HiddenActivity.c;
                                                exc.getClass();
                                                str = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "CREATE_UNKNOWN" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver2 = hiddenActivity.a;
                                                resultReceiver2.getClass();
                                                hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                                return;
                                            case 1:
                                                int i3 = HiddenActivity.c;
                                                exc.getClass();
                                                str = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "CREATE_UNKNOWN" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver3 = hiddenActivity.a;
                                                resultReceiver3.getClass();
                                                hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                                return;
                                            case 2:
                                                int i4 = HiddenActivity.c;
                                                exc.getClass();
                                                str2 = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "GET_NO_CREDENTIALS" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver4 = hiddenActivity.a;
                                                resultReceiver4.getClass();
                                                hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                                return;
                                            default:
                                                int i5 = HiddenActivity.c;
                                                exc.getClass();
                                                str2 = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "GET_NO_CREDENTIALS" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver5 = hiddenActivity.a;
                                                resultReceiver5.getClass();
                                                hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                                return;
                                        }
                                    }
                                });
                            }
                            if (task == null) {
                                Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                    case 1246634622:
                        if (stringExtra.equals("CREATE_PASSWORD")) {
                            px9 px9Var = (px9) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra3 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (px9Var != null) {
                                vvd vvdVar2 = new vvd(this, (iwd) new Object());
                                px9 px9Var2 = new px9(px9Var.a, vvdVar2.l, px9Var.c);
                                uu5 b3 = uu5.b();
                                b3.d = new mb4[]{k27.d};
                                b3.c = new xk9(16, vvdVar2, px9Var2);
                                b3.a = false;
                                b3.b = 1536;
                                task = vvdVar2.b(0, b3.a()).addOnSuccessListener(new q6(new b65(this, intExtra3, 1), 25)).addOnFailureListener(new OnFailureListener(this) { // from class: a65
                                    public final /* synthetic */ HiddenActivity b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // com.google.android.gms.tasks.OnFailureListener
                                    public final void onFailure(Exception exc) {
                                        int i = r2;
                                        String str = "CREATE_INTERRUPTED";
                                        String str2 = "GET_INTERRUPTED";
                                        HiddenActivity hiddenActivity = this.b;
                                        switch (i) {
                                            case 0:
                                                int i2 = HiddenActivity.c;
                                                exc.getClass();
                                                str = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "CREATE_UNKNOWN" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver2 = hiddenActivity.a;
                                                resultReceiver2.getClass();
                                                hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                                return;
                                            case 1:
                                                int i3 = HiddenActivity.c;
                                                exc.getClass();
                                                str = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "CREATE_UNKNOWN" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver3 = hiddenActivity.a;
                                                resultReceiver3.getClass();
                                                hiddenActivity.a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                                return;
                                            case 2:
                                                int i4 = HiddenActivity.c;
                                                exc.getClass();
                                                str2 = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "GET_NO_CREDENTIALS" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver4 = hiddenActivity.a;
                                                resultReceiver4.getClass();
                                                hiddenActivity.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                                return;
                                            default:
                                                int i5 = HiddenActivity.c;
                                                exc.getClass();
                                                str2 = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "GET_NO_CREDENTIALS" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver5 = hiddenActivity.a;
                                                resultReceiver5.getClass();
                                                hiddenActivity.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                                return;
                                        }
                                    }
                                });
                            }
                            if (task == null) {
                                Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                    case 1980564212:
                        if (stringExtra.equals("SIGN_IN_INTENT")) {
                            zx4 zx4Var = (zx4) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra4 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (zx4Var != null) {
                                vvd vvdVar3 = new vvd(this, (wwd) new Object());
                                String str = zx4Var.a;
                                am8.s(str);
                                String str2 = zx4Var.d;
                                zx4 zx4Var2 = new zx4(str, zx4Var.b, zx4Var.e, vvdVar3.l, zx4Var.f, str2);
                                uu5 b4 = uu5.b();
                                b4.d = new mb4[]{k27.e};
                                b4.c = new k57(19, vvdVar3, zx4Var2);
                                b4.b = 1555;
                                task = vvdVar3.b(0, b4.a()).addOnSuccessListener(new q6(new b65(this, intExtra4, 3), 26)).addOnFailureListener(new OnFailureListener(this) { // from class: a65
                                    public final /* synthetic */ HiddenActivity b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // com.google.android.gms.tasks.OnFailureListener
                                    public final void onFailure(Exception exc) {
                                        int i = r2;
                                        String str3 = "CREATE_INTERRUPTED";
                                        String str22 = "GET_INTERRUPTED";
                                        HiddenActivity hiddenActivity = this.b;
                                        switch (i) {
                                            case 0:
                                                int i2 = HiddenActivity.c;
                                                exc.getClass();
                                                str3 = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "CREATE_UNKNOWN" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver2 = hiddenActivity.a;
                                                resultReceiver2.getClass();
                                                hiddenActivity.a(resultReceiver2, str3, "During create public key credential, fido registration failure: " + exc.getMessage());
                                                return;
                                            case 1:
                                                int i3 = HiddenActivity.c;
                                                exc.getClass();
                                                str3 = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "CREATE_UNKNOWN" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver3 = hiddenActivity.a;
                                                resultReceiver3.getClass();
                                                hiddenActivity.a(resultReceiver3, str3, "During save password, found password failure response from one tap " + exc.getMessage());
                                                return;
                                            case 2:
                                                int i4 = HiddenActivity.c;
                                                exc.getClass();
                                                str22 = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "GET_NO_CREDENTIALS" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver4 = hiddenActivity.a;
                                                resultReceiver4.getClass();
                                                hiddenActivity.a(resultReceiver4, str22, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                                return;
                                            default:
                                                int i5 = HiddenActivity.c;
                                                exc.getClass();
                                                str22 = ((exc instanceof fv) && yb2.b.contains(Integer.valueOf(((fv) exc).getStatusCode()))) ? "GET_NO_CREDENTIALS" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver5 = hiddenActivity.a;
                                                resultReceiver5.getClass();
                                                hiddenActivity.a(resultReceiver5, str22, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                                return;
                                        }
                                    }
                                });
                            }
                            if (task == null) {
                                Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                }
            }
            Log.w("HiddenActivity", "Activity handed an unsupported type");
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(bundle);
    }
}
