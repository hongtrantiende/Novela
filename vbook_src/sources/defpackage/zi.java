package defpackage;

import java.io.File;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zi  reason: default package */
/* loaded from: classes3.dex */
public final class zi extends yqe {
    public final File b;

    public zi(File file) {
        this.b = file;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zi) || !this.b.equals(((zi) obj).b)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FileWrapper(file=" + this.b + ")";
    }
}
