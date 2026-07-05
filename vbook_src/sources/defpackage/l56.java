package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l56  reason: default package */
/* loaded from: classes3.dex */
public final class l56 implements b9a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Iterator b;

    public /* synthetic */ l56(Iterator it, int i) {
        this.a = i;
        this.b = it;
    }

    @Override // defpackage.b9a
    public final Iterator iterator() {
        int i = this.a;
        return this.b;
    }
}
