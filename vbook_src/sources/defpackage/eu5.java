package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eu5  reason: default package */
/* loaded from: classes3.dex */
public final class eu5 implements Iterable, j76 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ eu5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) ((ve) obj).b;
                objArr.getClass();
                return new il3(new b2(objArr));
            case 1:
                return new o13((p13) obj);
            default:
                return new b2((ou3) obj);
        }
    }
}
