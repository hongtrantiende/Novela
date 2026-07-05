package defpackage;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wf4  reason: default package */
/* loaded from: classes.dex */
public final class wf4 implements hve {
    public final /* synthetic */ FirebaseAuth a;

    public wf4(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.a = firebaseAuth;
    }

    @Override // defpackage.hve
    public final void b(p4e p4eVar, f0e f0eVar) {
        am8.s(p4eVar);
        am8.s(f0eVar);
        f0eVar.a = p4eVar;
        FirebaseAuth firebaseAuth = this.a;
        firebaseAuth.getClass();
        FirebaseAuth.f(firebaseAuth, f0eVar, p4eVar, true, false);
    }
}
