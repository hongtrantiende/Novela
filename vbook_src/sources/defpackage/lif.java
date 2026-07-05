package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lif  reason: default package */
/* loaded from: classes.dex */
public final class lif extends ckf {
    public static final /* synthetic */ int d = 0;
    public final AtomicLong c = new AtomicLong(-1);

    static {
        new bif(1);
    }

    @Override // defpackage.ckf
    public final void a() {
        AtomicLong atomicLong = this.c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
