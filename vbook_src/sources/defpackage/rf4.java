package defpackage;

import com.google.firebase.auth.FirebaseAuth;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rf4  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf4 {
    public final /* synthetic */ y69 a;

    public /* synthetic */ rf4(y69 y69Var) {
        this.a = y69Var;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        hh4 hh4Var;
        f0e a = firebaseAuth.a();
        if (a != null) {
            hh4Var = new hh4(a);
        } else {
            hh4Var = null;
        }
        this.a.j(hh4Var);
    }
}
