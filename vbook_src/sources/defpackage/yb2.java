package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.Set;
import java.util.concurrent.Executor;
import org.mozilla.javascript.Parser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yb2  reason: default package */
/* loaded from: classes.dex */
public abstract class yb2 {
    public static final tb2 a = new Object();
    public static final Set b = b00.F0(new Integer[]{7, 20});
    public static final int c = 1;

    public static final void a(CancellationSignal cancellationSignal, vt4 vt4Var) {
        vt4Var.getClass();
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (ec2.a(cancellationSignal)) {
            return;
        }
        vt4Var.invoke();
    }

    public static void b(ResultReceiver resultReceiver, Intent intent, String str) {
        resultReceiver.getClass();
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", c);
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain));
        intent.setFlags(Parser.ARGC_LIMIT);
    }

    public static boolean c(Bundle bundle, lu4 lu4Var, Executor executor, rb2 rb2Var, CancellationSignal cancellationSignal) {
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        a(cancellationSignal, new xb2(0, executor, rb2Var, lu4Var.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"))));
        return true;
    }
}
