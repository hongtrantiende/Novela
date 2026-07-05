package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ewd  reason: default package */
/* loaded from: classes.dex */
public final class ewd extends qz4 {
    public final GoogleSignInOptions A;

    /* JADX WARN: Type inference failed for: r2v1, types: [t05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [t05, java.lang.Object] */
    public ewd(Context context, Looper looper, yv yvVar, GoogleSignInOptions googleSignInOptions, oud oudVar, oud oudVar2) {
        super(context, looper, 91, yvVar, oudVar, oudVar2, 0);
        t05 t05Var;
        Set<Scope> set = (Set) yvVar.b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.a = new HashSet();
            obj.h = new HashMap();
            obj.a = new HashSet(googleSignInOptions.b);
            obj.b = googleSignInOptions.e;
            obj.c = googleSignInOptions.f;
            obj.d = googleSignInOptions.d;
            obj.e = googleSignInOptions.C;
            obj.f = googleSignInOptions.c;
            obj.g = googleSignInOptions.D;
            obj.h = GoogleSignInOptions.d(googleSignInOptions.E);
            obj.i = googleSignInOptions.F;
            t05Var = obj;
        } else {
            ?? obj2 = new Object();
            obj2.a = new HashSet();
            obj2.h = new HashMap();
            t05Var = obj2;
        }
        t05Var.i = xvd.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = t05Var.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = t05Var.a;
        if (hashSet2.contains(GoogleSignInOptions.J)) {
            Scope scope2 = GoogleSignInOptions.I;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (t05Var.d && (t05Var.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.H);
        }
        this.A = new GoogleSignInOptions(3, new ArrayList(hashSet2), t05Var.f, t05Var.d, t05Var.b, t05Var.c, t05Var.e, t05Var.g, t05Var.h, t05Var.i);
    }

    @Override // defpackage.rh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof vwd) {
            return (vwd) queryLocalInterface;
        }
        return new ftd(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 2);
    }

    @Override // defpackage.rh0
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.rh0
    public final String m() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.rh0
    public final String n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
