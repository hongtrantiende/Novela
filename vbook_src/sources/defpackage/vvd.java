package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.Status;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vvd  reason: default package */
/* loaded from: classes.dex */
public final class vvd extends tz4 {
    public static final s6f m = new s6f("Auth.Api.Identity.CredentialSaving.API", new hud(5), new tn3(16));
    public static final s6f n = new s6f("Auth.Api.Identity.SignIn.API", new hud(6), new tn3(16));
    public static final s6f o = new s6f("Auth.Api.Identity.Authorization.API", new hud(8), new tn3(16));
    public final String l;

    public vvd(HiddenActivity hiddenActivity, iwd iwdVar) {
        super(hiddenActivity, hiddenActivity, m, iwdVar, sz4.c);
        this.l = xvd.a();
    }

    public static vka c(Intent intent) {
        ww9 b;
        Status status = Status.C;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            ww9 ww9Var = null;
            if (byteArrayExtra == null) {
                b = null;
            } else {
                b = kve.b(byteArrayExtra, creator);
            }
            Status status2 = (Status) b;
            if (status2 != null) {
                if (status2.c()) {
                    Parcelable.Creator<vka> creator2 = vka.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        ww9Var = kve.b(byteArrayExtra2, creator2);
                    }
                    vka vkaVar = (vka) ww9Var;
                    if (vkaVar != null) {
                        return vkaVar;
                    }
                    throw new fv(status);
                }
                throw new fv(status2);
            }
            throw new fv(Status.E);
        }
        throw new fv(status);
    }

    public vvd(HiddenActivity hiddenActivity, wwd wwdVar) {
        super(hiddenActivity, hiddenActivity, n, wwdVar, sz4.c);
        this.l = xvd.a();
    }

    public vvd(Context context, tvd tvdVar) {
        super(context, null, o, tvdVar, sz4.c);
        this.l = xvd.a();
    }

    public vvd(Context context, wwd wwdVar) {
        super(context, null, n, wwdVar, sz4.c);
        this.l = xvd.a();
    }
}
