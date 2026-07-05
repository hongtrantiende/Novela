package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eu8  reason: default package */
/* loaded from: classes.dex */
public final class eu8 extends p3 implements us5 {
    public final /* synthetic */ int a;
    public final yt8 b;

    public /* synthetic */ eu8(yt8 yt8Var, int i) {
        this.a = i;
        this.b = yt8Var;
    }

    @Override // defpackage.v0
    public final int a() {
        int i = this.a;
        yt8 yt8Var = this.b;
        switch (i) {
            case 0:
                yt8Var.getClass();
                return yt8Var.b;
            default:
                yt8Var.getClass();
                return yt8Var.b;
        }
    }

    @Override // defpackage.v0, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        yt8 yt8Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = yt8Var.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !yt8Var.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return yt8Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                znc zncVar = this.b.a;
                aoc[] aocVarArr = new aoc[8];
                for (int i = 0; i < 8; i++) {
                    aocVarArr[i] = new boc(0);
                }
                return new zt8(zncVar, aocVarArr);
            default:
                znc zncVar2 = this.b.a;
                aoc[] aocVarArr2 = new aoc[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    aocVarArr2[i2] = new boc(1);
                }
                return new zt8(zncVar2, aocVarArr2);
        }
    }
}
