package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vb2  reason: default package */
/* loaded from: classes.dex */
public final class vb2 extends ResultReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vb2(yb2 yb2Var, Handler handler, int i) {
        super(handler);
        this.a = i;
        this.b = yb2Var;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [wwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [wwd, java.lang.Object] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        int i2 = this.a;
        yb2 yb2Var = this.b;
        bundle.getClass();
        switch (i2) {
            case 0:
                wb2 wb2Var = (wb2) yb2Var;
                if (!yb2.c(bundle, new xe1(2, yb2.a, tb2.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 1), wb2Var.f(), wb2Var.e(), wb2Var.g)) {
                    int i3 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent = (Intent) bundle.getParcelable("RESULT_DATA");
                    int i4 = yb2.c;
                    if (i3 != i4) {
                        Log.w("BeginSignIn", "Returned request code " + i4 + " which  does not match what was given " + i3);
                        return;
                    }
                    jc jcVar = new jc(wb2Var, 13);
                    CancellationSignal cancellationSignal = wb2Var.g;
                    if (i != -1) {
                        ?? obj = new Object();
                        obj.a = new ox4(wq9.G(i), 3);
                        if (i == 0) {
                            obj.a = new nx4("activity is cancelled by the user.");
                        }
                        yb2.a(cancellationSignal, new hg(9, jcVar, obj));
                        return;
                    }
                    try {
                        Context context = wb2Var.d;
                        am8.s(context);
                        new vvd(context, (wwd) new Object());
                        yb2.a(wb2Var.g, new hg(5, wb2Var, wb2Var.d(vvd.c(intent))));
                        return;
                    } catch (fv e) {
                        ?? obj2 = new Object();
                        obj2.a = new ox4(e.getMessage(), 3);
                        if (e.getStatusCode() == 16) {
                            obj2.a = new nx4(e.getMessage());
                        } else if (yb2.b.contains(Integer.valueOf(e.getStatusCode()))) {
                            obj2.a = new ox4(e.getMessage(), 1);
                        }
                        yb2.a(wb2Var.g, new hg(6, wb2Var, obj2));
                        return;
                    } catch (px4 e2) {
                        yb2.a(wb2Var.g, new hg(7, wb2Var, e2));
                        return;
                    } catch (Throwable th) {
                        yb2.a(wb2Var.g, new hg(8, wb2Var, new ox4(th.getMessage(), 3)));
                        return;
                    }
                }
                return;
            default:
                cc2 cc2Var = (cc2) yb2Var;
                if (!yb2.c(bundle, new xe1(2, yb2.a, tb2.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 2), cc2Var.f(), cc2Var.e(), cc2Var.g)) {
                    int i5 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent2 = (Intent) bundle.getParcelable("RESULT_DATA");
                    int i6 = yb2.c;
                    if (i5 != i6) {
                        Log.w("GetSignInIntent", "Returned request code " + i6 + " which  does not match what was given " + i5);
                        return;
                    }
                    jc jcVar2 = new jc(cc2Var, 14);
                    CancellationSignal cancellationSignal2 = cc2Var.g;
                    if (i != -1) {
                        ?? obj3 = new Object();
                        obj3.a = new ox4(wq9.G(i), 3);
                        if (i == 0) {
                            obj3.a = new nx4("activity is cancelled by the user.");
                        }
                        yb2.a(cancellationSignal2, new hg(9, jcVar2, obj3));
                        return;
                    }
                    try {
                        Context context2 = cc2Var.d;
                        am8.s(context2);
                        new vvd(context2, (wwd) new Object());
                        yb2.a(cc2Var.g, new hg(10, cc2Var, cc2Var.d(vvd.c(intent2))));
                        return;
                    } catch (fv e3) {
                        ?? obj4 = new Object();
                        obj4.a = new ox4(e3.getMessage(), 3);
                        if (e3.getStatusCode() == 16) {
                            obj4.a = new nx4(e3.getMessage());
                        } else if (yb2.b.contains(Integer.valueOf(e3.getStatusCode()))) {
                            obj4.a = new ox4(e3.getMessage(), 1);
                        }
                        yb2.a(cc2Var.g, new hg(11, cc2Var, obj4));
                        return;
                    } catch (px4 e4) {
                        yb2.a(cc2Var.g, new hg(12, cc2Var, e4));
                        return;
                    } catch (Throwable th2) {
                        yb2.a(cc2Var.g, new hg(13, cc2Var, new ox4(th2.getMessage(), 3)));
                        return;
                    }
                }
                return;
        }
    }
}
