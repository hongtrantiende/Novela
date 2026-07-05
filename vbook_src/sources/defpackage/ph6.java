package defpackage;

import java.util.Comparator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ph6  reason: default package */
/* loaded from: classes.dex */
public final class ph6 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ kj b;

    public /* synthetic */ ph6(kj kjVar, int i) {
        this.a = i;
        this.b = kjVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        kj kjVar = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(kjVar.o(((wh6) obj).getKey())).compareTo(Integer.valueOf(kjVar.o(((wh6) obj2).getKey())));
            case 1:
                return Integer.valueOf(kjVar.o(((wh6) obj).getKey())).compareTo(Integer.valueOf(kjVar.o(((wh6) obj2).getKey())));
            case 2:
                return Integer.valueOf(kjVar.o(((wh6) obj2).getKey())).compareTo(Integer.valueOf(kjVar.o(((wh6) obj).getKey())));
            default:
                return Integer.valueOf(kjVar.o(((wh6) obj2).getKey())).compareTo(Integer.valueOf(kjVar.o(((wh6) obj).getKey())));
        }
    }
}
