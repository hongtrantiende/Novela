package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gu8  reason: default package */
/* loaded from: classes.dex */
public final class gu8 extends p3 implements us5, Collection, j76 {
    public static final gu8 d;
    public final Object a;
    public final Object b;
    public final yt8 c;

    static {
        hq7 hq7Var = hq7.H;
        d = new gu8(hq7Var, hq7Var, yt8.c);
    }

    public gu8(Object obj, Object obj2, yt8 yt8Var) {
        this.a = obj;
        this.b = obj2;
        this.c = yt8Var;
    }

    @Override // defpackage.v0
    public final int a() {
        yt8 yt8Var = this.c;
        yt8Var.getClass();
        return yt8Var.b;
    }

    public final gu8 b(Object obj) {
        yt8 yt8Var = this.c;
        if (yt8Var.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new gu8(obj, obj, yt8Var.c(obj, new dq6()));
        }
        Object obj2 = this.b;
        Object obj3 = yt8Var.get(obj2);
        obj3.getClass();
        return new gu8(this.a, obj, yt8Var.c(obj2, new dq6(((dq6) obj3).a, obj)).c(obj, new dq6(obj2)));
    }

    public final gu8 c(Object obj) {
        int i;
        Object obj2;
        yt8 yt8Var = this.c;
        dq6 dq6Var = (dq6) yt8Var.get(obj);
        if (dq6Var == null) {
            return this;
        }
        Object obj3 = dq6Var.a;
        Object obj4 = dq6Var.b;
        znc zncVar = yt8Var.a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        znc v = zncVar.v(i, obj, 0);
        if (zncVar != v) {
            if (v == null) {
                yt8Var = yt8.c;
            } else {
                yt8Var = new yt8(v, yt8Var.b - 1);
            }
        }
        hq7 hq7Var = hq7.H;
        if (obj3 != hq7Var) {
            Object obj5 = yt8Var.get(obj3);
            obj5.getClass();
            yt8Var = yt8Var.c(obj3, new dq6(((dq6) obj5).a, obj4));
        }
        if (obj4 != hq7Var) {
            Object obj6 = yt8Var.get(obj4);
            obj6.getClass();
            yt8Var = yt8Var.c(obj4, new dq6(obj3, ((dq6) obj6).b));
        }
        if (obj3 != hq7Var) {
            obj2 = this.a;
        } else {
            obj2 = obj4;
        }
        if (obj4 != hq7Var) {
            obj3 = this.b;
        }
        return new gu8(obj2, obj3, yt8Var);
    }

    @Override // defpackage.v0, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new sw4(this.a, this.c);
    }
}
