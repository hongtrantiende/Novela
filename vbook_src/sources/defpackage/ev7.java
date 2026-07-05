package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ev7  reason: default package */
/* loaded from: classes.dex */
public final class ev7 extends u07 implements m76 {
    public final st6 d;
    public Object e;

    public ev7(st6 st6Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.d = st6Var;
        this.e = obj2;
    }

    @Override // defpackage.u07, java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // defpackage.u07, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        Object obj2 = this.e;
        this.e = obj;
        bu8 bu8Var = (bu8) this.d.b;
        au8 au8Var = bu8Var.d;
        Object obj3 = this.b;
        if (!au8Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = bu8Var.c;
        if (z) {
            if (z) {
                aoc aocVar = bu8Var.a[bu8Var.b];
                Object obj4 = aocVar.a[aocVar.c];
                au8Var.put(obj3, obj);
                if (obj4 != null) {
                    i = obj4.hashCode();
                } else {
                    i = 0;
                }
                bu8Var.c(i, au8Var.c, obj4, 0);
            } else {
                xk5.g();
                return null;
            }
        } else {
            au8Var.put(obj3, obj);
        }
        bu8Var.C = au8Var.e;
        return obj2;
    }
}
