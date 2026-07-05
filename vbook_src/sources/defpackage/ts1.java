package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ts1  reason: default package */
/* loaded from: classes.dex */
public final class ts1 extends s2 {
    public final Object a;
    public int b;
    public final /* synthetic */ us1 c;

    public ts1(us1 us1Var, int i) {
        this.c = us1Var;
        Object obj = us1.F;
        this.a = us1Var.i()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        us1 us1Var = this.c;
        if (i != -1 && i < us1Var.size()) {
            if (bue.g(obj, us1Var.i()[this.b])) {
                return;
            }
        }
        Object obj2 = us1.F;
        this.b = us1Var.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        us1 us1Var = this.c;
        Map b = us1Var.b();
        if (b != null) {
            return b.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return us1Var.j()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        us1 us1Var = this.c;
        Map b = us1Var.b();
        Object obj2 = this.a;
        if (b != null) {
            return b.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            us1Var.put(obj2, obj);
            return null;
        }
        Object obj3 = us1Var.j()[i];
        us1Var.j()[this.b] = obj;
        return obj3;
    }
}
