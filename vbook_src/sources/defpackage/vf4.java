package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vf4  reason: default package */
/* loaded from: classes.dex */
public final class vf4 implements aae, hve {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseAuth b;

    public vf4(FirebaseAuth firebaseAuth, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = firebaseAuth;
                return;
            default:
                Objects.requireNonNull(firebaseAuth);
                this.b = firebaseAuth;
                return;
        }
    }

    @Override // defpackage.aae
    public final void a(Status status) {
        int i = this.a;
        FirebaseAuth firebaseAuth = this.b;
        switch (i) {
            case 0:
                int i2 = status.a;
                if (i2 == 17011 || i2 == 17021 || i2 == 17005 || i2 == 17091) {
                    firebaseAuth.c();
                    return;
                }
                return;
            default:
                int i3 = status.a;
                if (i3 == 17011 || i3 == 17021 || i3 == 17005) {
                    firebaseAuth.c();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.hve
    public final void b(p4e p4eVar, f0e f0eVar) {
        int i = this.a;
        FirebaseAuth firebaseAuth = this.b;
        switch (i) {
            case 0:
                am8.s(p4eVar);
                am8.s(f0eVar);
                f0eVar.a = p4eVar;
                firebaseAuth.getClass();
                FirebaseAuth.f(firebaseAuth, f0eVar, p4eVar, true, true);
                return;
            default:
                firebaseAuth.getClass();
                FirebaseAuth.f(firebaseAuth, f0eVar, p4eVar, true, true);
                return;
        }
    }
}
