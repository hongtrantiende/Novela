package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nwd  reason: default package */
/* loaded from: classes.dex */
public final class nwd extends BasePendingResult {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwd(qud qudVar, int i) {
        super(qudVar);
        this.k = i;
        am8.t(qudVar, "GoogleApiClient must not be null");
        am8.t(t60.a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ is9 b(Status status) {
        int i = this.k;
        return status;
    }

    public final void f(qz4 qz4Var) {
        switch (this.k) {
            case 0:
                ewd ewdVar = (ewd) qz4Var;
                vwd vwdVar = (vwd) ewdVar.l();
                mwd mwdVar = new mwd(this, 0);
                GoogleSignInOptions googleSignInOptions = ewdVar.A;
                Parcel e = vwdVar.e();
                int i = bwd.a;
                e.writeStrongBinder(mwdVar);
                bwd.c(e, googleSignInOptions);
                vwdVar.f(e, 102);
                return;
            default:
                ewd ewdVar2 = (ewd) qz4Var;
                vwd vwdVar2 = (vwd) ewdVar2.l();
                mwd mwdVar2 = new mwd(this, 1);
                GoogleSignInOptions googleSignInOptions2 = ewdVar2.A;
                Parcel e2 = vwdVar2.e();
                int i2 = bwd.a;
                e2.writeStrongBinder(mwdVar2);
                bwd.c(e2, googleSignInOptions2);
                vwdVar2.f(e2, Token.ASSIGN_BITAND);
                return;
        }
    }

    public final void g(Status status) {
        am8.m("Failed result must not be success", !status.c());
        e(b(status));
    }
}
