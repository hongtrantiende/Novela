package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hza  reason: default package */
/* loaded from: classes3.dex */
public final class hza extends z1 implements Iterator, j76 {
    public final /* synthetic */ int C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hza(qra qraVar, Iterator it, int i) {
        super(qraVar, it);
        this.C = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.C) {
            case 0:
                a();
                if (((Map.Entry) this.c) != null) {
                    return new n81(this);
                }
                vm1.d();
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) this.f;
                if (entry != null) {
                    a();
                    return entry.getKey();
                }
                vm1.d();
                return null;
            default:
                Map.Entry entry2 = (Map.Entry) this.f;
                if (entry2 != null) {
                    a();
                    return entry2.getValue();
                }
                vm1.d();
                return null;
        }
    }
}
