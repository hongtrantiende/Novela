package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xud  reason: default package */
/* loaded from: classes.dex */
public final class xud extends mud implements wz4, xz4 {
    public static final hud n = avd.a;
    public final Context b;
    public final Handler c;
    public final hud d;
    public final Set e;
    public final yv f;
    public uka l;
    public wf2 m;

    public xud(Context context, ovd ovdVar, yv yvVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.b = context;
        this.c = ovdVar;
        this.f = yvVar;
        this.e = (Set) yvVar.a;
        this.d = n;
    }

    @Override // defpackage.mud
    public final boolean Q(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                jz1 jz1Var = (jz1) uud.a(parcel, jz1.CREATOR);
                iud iudVar = (iud) uud.a(parcel, iud.CREATOR);
                uud.b(parcel);
                break;
            case 4:
                Status status = (Status) uud.a(parcel, Status.CREATOR);
                uud.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) uud.a(parcel, Status.CREATOR);
                uud.b(parcel);
                break;
            case 7:
                Status status3 = (Status) uud.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) uud.a(parcel, GoogleSignInAccount.CREATOR);
                uud.b(parcel);
                break;
            case 8:
                uud.b(parcel);
                this.c.post(new bv4(this, false, (mvd) uud.a(parcel, mvd.CREATOR), 14));
                break;
            case 9:
                gvd gvdVar = (gvd) uud.a(parcel, gvd.CREATOR);
                uud.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.xz4
    public final void a(jz1 jz1Var) {
        this.m.m(jz1Var);
    }

    @Override // defpackage.wz4
    public final void e(int i) {
        wf2 wf2Var = this.m;
        oud oudVar = (oud) ((yz4) wf2Var.f).F.get((jv) wf2Var.c);
        if (oudVar != null) {
            if (oudVar.n) {
                oudVar.n(new jz1(17, null, null));
            } else {
                oudVar.e(i);
            }
        }
    }

    @Override // defpackage.wz4
    public final void f() {
        GoogleSignInAccount googleSignInAccount;
        uka ukaVar = this.l;
        ukaVar.getClass();
        try {
            ukaVar.B.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = o0b.a(ukaVar.c).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = ukaVar.D;
            am8.s(num);
            rvd rvdVar = new rvd(2, account, num.intValue(), googleSignInAccount);
            dvd dvdVar = (dvd) ukaVar.l();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(dvdVar.c);
            int i = uud.a;
            obtain.writeInt(1);
            int U = uue.U(obtain, 20293);
            uue.T(obtain, 1, 4);
            obtain.writeInt(1);
            uue.O(obtain, 2, rvdVar, 0);
            uue.V(obtain, U);
            obtain.writeStrongBinder(this);
            Parcel obtain2 = Parcel.obtain();
            dvdVar.b.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.c.post(new bv4(this, false, new mvd(1, new jz1(8, null, null), null), 14));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
