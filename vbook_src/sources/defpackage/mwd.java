package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mwd  reason: default package */
/* loaded from: classes.dex */
public final class mwd extends mud implements IInterface {
    public final /* synthetic */ int b;
    public final /* synthetic */ nwd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwd(nwd nwdVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 1);
        this.b = i;
        this.c = nwdVar;
    }

    @Override // defpackage.mud
    public final boolean R(int i, Parcel parcel, Parcel parcel2) {
        nwd nwdVar = this.c;
        int i2 = this.b;
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) bwd.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) bwd.a(parcel, Status.CREATOR);
                bwd.b(parcel);
                cp8.q();
                return false;
            case 102:
                Status status2 = (Status) bwd.a(parcel, Status.CREATOR);
                bwd.b(parcel);
                switch (i2) {
                    case 0:
                        nwdVar.e(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case Token.ASSIGN_BITAND /* 103 */:
                Status status3 = (Status) bwd.a(parcel, Status.CREATOR);
                bwd.b(parcel);
                switch (i2) {
                    case 1:
                        nwdVar.e(status3);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
