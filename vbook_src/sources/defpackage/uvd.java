package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uvd  reason: default package */
/* loaded from: classes.dex */
public final class uvd extends mud {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvd(int i, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback", 1);
        this.b = i;
        switch (i) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 1);
                return;
            case 2:
                this.c = taskCompletionSource;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 1);
                return;
            case 3:
                this.c = taskCompletionSource;
                super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback", 1);
                return;
            default:
                this.c = taskCompletionSource;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [xb4, tz4] */
    /* JADX WARN: Type inference failed for: r9v15, types: [kh5, java.lang.Object] */
    @Override // defpackage.mud
    public final boolean R(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        BasePendingResult basePendingResult;
        boolean z2;
        BasePendingResult basePendingResult2;
        String e;
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return false;
                }
                bwd.b(parcel);
                uue.E((Status) bwd.a(parcel, Status.CREATOR), (qx9) bwd.a(parcel, qx9.CREATOR), (TaskCompletionSource) obj);
                return true;
            case 1:
                if (i != 1) {
                    return false;
                }
                bwd.b(parcel);
                uue.E((Status) bwd.a(parcel, Status.CREATOR), (gk0) bwd.a(parcel, gk0.CREATOR), (TaskCompletionSource) obj);
                return true;
            case 2:
                if (i != 1) {
                    return false;
                }
                bwd.b(parcel);
                uue.E((Status) bwd.a(parcel, Status.CREATOR), (PendingIntent) bwd.a(parcel, PendingIntent.CREATOR), (TaskCompletionSource) obj);
                return true;
            case 3:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) bwd.a(parcel, Status.CREATOR);
                q70 q70Var = (q70) bwd.a(parcel, q70.CREATOR);
                bwd.b(parcel);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                if (status.c()) {
                    taskCompletionSource.setResult(q70Var);
                    return true;
                }
                taskCompletionSource.setException(gue.p(status));
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    T();
                    uwd.C(revocationBoundService).D();
                    return true;
                }
                T();
                o0b a = o0b.a(revocationBoundService);
                GoogleSignInAccount b = a.b();
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.G;
                if (b != null) {
                    String e2 = a.e("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(e2) && (e = a.e(o0b.f("googleSignInOptions", e2))) != null) {
                        try {
                            googleSignInOptions = GoogleSignInOptions.c(e);
                        } catch (JSONException unused) {
                        }
                    }
                    googleSignInOptions = null;
                }
                GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
                am8.s(googleSignInOptions2);
                ?? tz4Var = new tz4((RevocationBoundService) obj, null, t60.a, googleSignInOptions2, new sz4(new Object(), Looper.getMainLooper()));
                Context context = tz4Var.a;
                qud qudVar = tz4Var.i;
                if (b != null) {
                    if (tz4Var.d() == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    kj kjVar = swd.a;
                    Object[] objArr = new Object[0];
                    if (kjVar.a <= 3) {
                        Log.d((String) kjVar.b, kjVar.k("Revoking access", objArr));
                    }
                    String e3 = o0b.a(context).e("refreshToken");
                    swd.a(context);
                    if (z2) {
                        if (e3 == null) {
                            kj kjVar2 = yvd.c;
                            Status status2 = new Status(4, null, null, null);
                            am8.m("Status code must not be SUCCESS", !status2.c());
                            BasePendingResult zudVar = new zud(status2);
                            zudVar.e(status2);
                            basePendingResult2 = zudVar;
                        } else {
                            yvd yvdVar = new yvd(e3);
                            new Thread(yvdVar).start();
                            basePendingResult2 = yvdVar.b;
                        }
                    } else {
                        nwd nwdVar = new nwd(qudVar, 1);
                        qudVar.a(nwdVar);
                        basePendingResult2 = nwdVar;
                    }
                    mp8 mp8Var = new mp8(8);
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    basePendingResult2.a(new pvd(basePendingResult2, taskCompletionSource2, mp8Var));
                    taskCompletionSource2.getTask();
                    return true;
                }
                if (tz4Var.d() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                kj kjVar3 = swd.a;
                Object[] objArr2 = new Object[0];
                if (kjVar3.a <= 3) {
                    Log.d((String) kjVar3.b, kjVar3.k("Signing out", objArr2));
                }
                swd.a(context);
                if (z) {
                    BasePendingResult basePendingResult3 = new BasePendingResult(qudVar);
                    basePendingResult3.e(Status.e);
                    basePendingResult = basePendingResult3;
                } else {
                    nwd nwdVar2 = new nwd(qudVar, 0);
                    qudVar.a(nwdVar2);
                    basePendingResult = nwdVar2;
                }
                mp8 mp8Var2 = new mp8(8);
                TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                basePendingResult.a(new pvd(basePendingResult, taskCompletionSource3, mp8Var2));
                taskCompletionSource3.getTask();
                return true;
        }
    }

    public void T() {
        if (xbe.E((RevocationBoundService) this.c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(hl5.l("Calling UID ", " is not Google Play services.", Binder.getCallingUid()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvd(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 1);
        this.b = 4;
        this.c = revocationBoundService;
    }
}
