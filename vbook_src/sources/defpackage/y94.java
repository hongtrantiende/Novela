package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y94  reason: default package */
/* loaded from: classes.dex */
public final class y94 implements t25 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Iterable b;

    public /* synthetic */ y94(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.t25
    public final String b(Object obj) {
        switch (this.a) {
            case 0:
                return (String) obj;
            default:
                return (String) obj;
        }
    }

    @Override // defpackage.t25
    public final Iterator l() {
        switch (this.a) {
            case 0:
                return this.b.iterator();
            default:
                return this.b.iterator();
        }
    }
}
