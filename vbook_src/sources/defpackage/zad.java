package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zad  reason: default package */
/* loaded from: classes3.dex */
public final class zad {
    public final String a;

    public zad(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zad) && c16.i(this.a, ((zad) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + eub.k(eub.k(this.a.hashCode() * 31, 31, false), 31, true);
    }

    public final String toString() {
        return hl5.n("VideoSourceInfo(name=", this.a, ", isSupportDownload=false, isSupportCheckNewChapter=true, isSupportShowEpisodeName=true)");
    }
}
