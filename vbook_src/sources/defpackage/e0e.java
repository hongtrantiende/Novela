package defpackage;

import com.google.firebase.auth.FirebaseAuth;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e0e  reason: default package */
/* loaded from: classes.dex */
public final class e0e implements xz5 {
    public final qf4 a;
    public final l99 b;
    public final l99 c;
    public final Executor d;
    public final Executor e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public e0e(qf4 qf4Var, l99 l99Var, l99 l99Var2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this.a = qf4Var;
        this.b = l99Var;
        this.c = l99Var2;
        this.d = executor2;
        this.e = executor4;
    }

    public final synchronized FirebaseAuth a() {
        if (this.f.containsKey("default")) {
            FirebaseAuth firebaseAuth = (FirebaseAuth) this.f.get("default");
            if (firebaseAuth == null) {
                this.f.remove("default");
            } else {
                return firebaseAuth;
            }
        }
        if (this.f.isEmpty()) {
            FirebaseAuth firebaseAuth2 = new FirebaseAuth(this.a, this.b, this.d, this.e);
            this.f.put("default", firebaseAuth2);
            return firebaseAuth2;
        }
        throw new IllegalStateException("FirebaseAuth instance has already been instantiated with different configuration.");
    }
}
