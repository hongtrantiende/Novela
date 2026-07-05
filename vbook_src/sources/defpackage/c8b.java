package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c8b  reason: default package */
/* loaded from: classes.dex */
public final class c8b implements Comparable {
    public final long a;
    public final byte[] b;

    public c8b(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((c8b) obj).a);
    }
}
