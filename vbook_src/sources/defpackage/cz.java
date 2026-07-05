package defpackage;

import java.io.Closeable;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cz  reason: default package */
/* loaded from: classes.dex */
public final class cz extends n42 {
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ox9 E;
    public int F;
    public mu4 a;
    public hn8 b;
    public Closeable c;
    public az0 d;
    public Iterator e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(ox9 ox9Var, n42 n42Var) {
        super(n42Var);
        this.E = ox9Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.y(null, null, null, this);
    }
}
