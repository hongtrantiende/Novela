package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yx4  reason: default package */
/* loaded from: classes.dex */
public final class yx4 extends o3 {
    public static final Parcelable.Creator<yx4> CREATOR = new kbe(28);
    public static final Scope[] K = new Scope[0];
    public static final mb4[] L = new mb4[0];
    public Bundle C;
    public Account D;
    public mb4[] E;
    public mb4[] F;
    public final boolean G;
    public final int H;
    public boolean I;
    public final String J;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;

    public yx4(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, mb4[] mb4VarArr, mb4[] mb4VarArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        mb4[] mb4VarArr3;
        Account account2;
        IInterface ftdVar;
        if (scopeArr == null) {
            scopeArr2 = K;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        mb4[] mb4VarArr4 = L;
        if (mb4VarArr == null) {
            mb4VarArr3 = mb4VarArr4;
        } else {
            mb4VarArr3 = mb4VarArr;
        }
        mb4VarArr4 = mb4VarArr2 != null ? mb4VarArr2 : mb4VarArr4;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = j5.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof ij5) {
                    ftdVar = (ij5) queryLocalInterface;
                } else {
                    ftdVar = new ftd(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        hbf hbfVar = (hbf) ftdVar;
                        Parcel Q = hbfVar.Q(hbfVar.S(), 2);
                        Account account3 = (Account) lde.a(Q, Account.CREATOR);
                        Q.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.e = iBinder;
            account2 = account;
        }
        this.D = account2;
        this.f = scopeArr2;
        this.C = bundle2;
        this.E = mb4VarArr3;
        this.F = mb4VarArr4;
        this.G = z;
        this.H = i4;
        this.I = z2;
        this.J = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kbe.a(this, parcel, i);
    }
}
