package defpackage;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: off  reason: default package */
/* loaded from: classes.dex */
public final class off implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ FirebaseAuth b;

    public off(FirebaseAuth firebaseAuth) {
        this.b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        FirebaseAuth firebaseAuth = this.b;
        switch (i) {
            case 0:
                Iterator it = firebaseAuth.c.iterator();
                while (it.hasNext()) {
                    ((rf4) it.next()).a(firebaseAuth);
                }
                return;
            default:
                Iterator it2 = firebaseAuth.d.iterator();
                if (!it2.hasNext()) {
                    Iterator it3 = firebaseAuth.b.iterator();
                    if (!it3.hasNext()) {
                        return;
                    }
                    throw rs8.f(it3);
                }
                throw rs8.f(it2);
        }
    }

    public off(FirebaseAuth firebaseAuth, k06 k06Var) {
        this.b = firebaseAuth;
    }
}
