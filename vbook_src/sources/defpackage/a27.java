package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a27  reason: default package */
/* loaded from: classes.dex */
public final class a27 extends v0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ a27(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v0
    public final int a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((b27) obj).a.groupCount() + 1;
            default:
                yt8 yt8Var = (yt8) obj;
                yt8Var.getClass();
                return yt8Var.b;
        }
    }

    public x17 b(int i) {
        Matcher matcher = ((b27) this.b).a;
        ty5 F = dce.F(matcher.start(i), matcher.end(i));
        if (F.a >= 0) {
            String group = matcher.group(i);
            group.getClass();
            return new x17(group, F);
        }
        return null;
    }

    @Override // defpackage.v0, java.util.Collection
    public final boolean contains(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                if (obj == null) {
                    z = true;
                } else {
                    z = obj instanceof x17;
                }
                if (!z) {
                    return false;
                }
                return super.contains((x17) obj);
            default:
                return ((yt8) this.b).containsValue(obj);
        }
    }

    @Override // defpackage.v0, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ak(new ki4(3, new c00(tl1.w(this), 1), new fo4(this, 25)));
            default:
                znc zncVar = ((yt8) this.b).a;
                aoc[] aocVarArr = new aoc[8];
                for (int i = 0; i < 8; i++) {
                    aocVarArr[i] = new boc(2);
                }
                return new zt8(zncVar, aocVarArr);
        }
    }
}
