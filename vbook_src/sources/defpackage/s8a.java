package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s8a  reason: default package */
/* loaded from: classes3.dex */
public final class s8a extends f5a {
    public final /* synthetic */ AtomicReferenceArray C;

    public s8a(long j, s8a s8aVar, int i) {
        super(j, s8aVar, i);
        this.C = new AtomicReferenceArray(r8a.f);
    }

    @Override // defpackage.f5a
    public final int l() {
        return r8a.f;
    }

    @Override // defpackage.f5a
    public final void m(int i, d82 d82Var) {
        this.C.set(i, r8a.e);
        n();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
