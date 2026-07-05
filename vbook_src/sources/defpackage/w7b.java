package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w7b  reason: default package */
/* loaded from: classes3.dex */
public final class w7b implements bw9 {
    public final u7b a = new u7b();
    public final mu9 b;

    public w7b() {
        new ConcurrentHashMap();
        this.b = new mu9(9, false);
    }

    @Override // defpackage.bw9
    public final rz6 a() {
        return this.b;
    }

    @Override // defpackage.bw9
    public final nj5 b() {
        return this.a;
    }

    @Override // defpackage.bw9
    public final String c() {
        throw new UnsupportedOperationException();
    }
}
