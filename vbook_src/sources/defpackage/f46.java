package defpackage;

import java.util.Date;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f46  reason: default package */
/* loaded from: classes.dex */
public final class f46 implements xs3 {
    public final HashMap a;
    public final HashMap b;
    public final c46 c;
    public boolean d;
    public static final c46 e = new c46(0);
    public static final d46 f = new x3d() { // from class: d46
        @Override // defpackage.ws3
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((y3d) obj2).b((String) obj);
                    return;
                default:
                    ((y3d) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final d46 C = new x3d() { // from class: d46
        @Override // defpackage.ws3
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((y3d) obj2).b((String) obj);
                    return;
                default:
                    ((y3d) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final e46 D = new Object();

    public f46() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, C);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, D);
        hashMap.remove(Date.class);
    }

    @Override // defpackage.xs3
    public final xs3 b(Class cls, e78 e78Var) {
        this.a.put(cls, e78Var);
        this.b.remove(cls);
        return this;
    }
}
