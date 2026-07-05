package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yhd  reason: default package */
/* loaded from: classes.dex */
public final class yhd implements Comparable {
    public final int a;
    public final uhd b;

    public yhd(int i, uhd uhdVar) {
        this.a = i;
        this.b = uhdVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((yhd) obj).a);
    }
}
