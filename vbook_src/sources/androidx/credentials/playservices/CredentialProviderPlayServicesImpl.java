package androidx.credentials.playservices;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements sb2 {
    public static final ec2 Companion = new Object();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private uz4 googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        context.getClass();
        this.context = context;
        this.googleApiAvailability = uz4.e;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i) {
        return this.googleApiAvailability.c(context, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [zl9, java.lang.Object] */
    private static final void onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, rb2 rb2Var, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Clearing restore credential failed", exc);
        ?? obj = new Object();
        obj.a = new e60("Clear restore credential failed for unknown reason.", 4);
        if ((exc instanceof fv) && ((fv) exc).getStatusCode() == 40201) {
            obj.a = new e60("The restore credential internal service had a failure.", 4);
        }
        ec2 ec2Var = Companion;
        xb2 xb2Var = new xb2(1, executor, rb2Var, obj);
        ec2Var.getClass();
        ec2.b(cancellationSignal, xb2Var);
    }

    private static final void onClearCredential$lambda$4(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, rb2 rb2Var, Exception exc) {
        exc.getClass();
        ec2 ec2Var = Companion;
        xb2 xb2Var = new xb2(exc, executor, rb2Var);
        ec2Var.getClass();
        ec2.b(cancellationSignal, xb2Var);
    }

    public final uz4 getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int i) {
        boolean z;
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i);
        if (isGooglePlayServicesAvailable == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            jz1 jz1Var = new jz1(isGooglePlayServicesAvailable, null, null);
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + jz1Var);
        }
        return z;
    }

    public void onClearCredential(si1 si1Var, CancellationSignal cancellationSignal, Executor executor, rb2 rb2Var) {
        throw null;
    }

    public void onCreateCredential(Context context, bb2 bb2Var, CancellationSignal cancellationSignal, Executor executor, rb2 rb2Var) {
        context.getClass();
        throw null;
    }

    @Override // defpackage.sb2
    public void onGetCredential(Context context, qx4 qx4Var, CancellationSignal cancellationSignal, Executor executor, rb2 rb2Var) {
        context.getClass();
        qx4Var.getClass();
        List<ay4> list = qx4Var.a;
        executor.getClass();
        rb2Var.getClass();
        Companion.getClass();
        if (!ec2.a(cancellationSignal)) {
            for (ay4 ay4Var : list) {
            }
            Companion.getClass();
            for (ay4 ay4Var2 : list) {
            }
            Companion.getClass();
            for (ay4 ay4Var3 : list) {
                if (ay4Var3 instanceof ay4) {
                    cc2 cc2Var = new cc2(context);
                    cc2Var.g = cancellationSignal;
                    cc2Var.e = rb2Var;
                    cc2Var.f = executor;
                    Companion.getClass();
                    if (!ec2.a(cancellationSignal)) {
                        try {
                            if (list.size() == 1) {
                                Object obj = list.get(0);
                                obj.getClass();
                                String str = ((ay4) obj).d;
                                am8.s(str);
                                zx4 zx4Var = new zx4(str, null, false, null, 0, null);
                                Intent intent = new Intent(context, HiddenActivity.class);
                                intent.putExtra("REQUEST_TYPE", zx4Var);
                                yb2.b(cc2Var.h, intent, "SIGN_IN_INTENT");
                                context.startActivity(intent);
                                return;
                            }
                            throw new sx4("GetSignInWithGoogleOption cannot be combined with other options.");
                        } catch (Exception e) {
                            if (e instanceof sx4) {
                                yb2.a(cancellationSignal, new hg(14, cc2Var, (sx4) e));
                                return;
                            } else {
                                yb2.a(cancellationSignal, new ik(cc2Var, 8));
                                return;
                            }
                        }
                    }
                    return;
                }
            }
            wb2 wb2Var = new wb2(context);
            wb2Var.g = cancellationSignal;
            wb2Var.e = rb2Var;
            wb2Var.f = executor;
            Companion.getClass();
            if (!ec2.a(cancellationSignal)) {
                ek0 ek0Var = new ek0(false);
                bk0 bk0Var = new bk0(false, null, null, true, null, null, false);
                dk0 dk0Var = new dk0(false, null, null);
                ck0 ck0Var = new ck0(null, false);
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                int i = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
                for (ay4 ay4Var4 : list) {
                }
                fk0 fk0Var = new fk0(ek0Var, bk0Var, null, false, 0, dk0Var, ck0Var, false);
                Intent intent2 = new Intent(context, HiddenActivity.class);
                intent2.putExtra("REQUEST_TYPE", fk0Var);
                yb2.b(wb2Var.h, intent2, "BEGIN_SIGN_IN");
                try {
                    context.startActivity(intent2);
                } catch (Exception unused) {
                    yb2.a(cancellationSignal, new ik(wb2Var, 6));
                }
            }
        }
    }

    public void onPrepareCredential(qx4 qx4Var, CancellationSignal cancellationSignal, Executor executor, rb2 rb2Var) {
        qx4Var.getClass();
        executor.getClass();
        rb2Var.getClass();
    }

    public final void setGoogleApiAvailability(uz4 uz4Var) {
        uz4Var.getClass();
        this.googleApiAvailability = uz4Var;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    @Override // defpackage.sb2
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onGetCredential(Context context, c59 c59Var, CancellationSignal cancellationSignal, Executor executor, rb2 rb2Var) {
        context.getClass();
        throw null;
    }
}
