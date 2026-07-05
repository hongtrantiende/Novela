package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ki4  reason: default package */
/* loaded from: classes3.dex */
public final class ki4 implements b9a {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ki4(c00 c00Var, xt4 xt4Var) {
        this.a = 0;
        k9a k9aVar = k9a.a;
        this.c = c00Var;
        this.b = xt4Var;
    }

    @Override // defpackage.b9a
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ef4(this);
            case 1:
                return new sw4(this);
            case 2:
                ArrayList arrayList = new ArrayList();
                for (Object obj : (b9a) this.c) {
                    arrayList.add(obj);
                }
                wl1.O((Comparator) this.b, arrayList);
                return arrayList.iterator();
            default:
                return new ak(this);
        }
    }

    public /* synthetic */ ki4(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
