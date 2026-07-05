package defpackage;

import java.io.File;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gn8  reason: default package */
/* loaded from: classes3.dex */
public final class gn8 {
    public final File a;

    public gn8(File file) {
        this.a = file;
    }

    public final String a() {
        String name = this.a.getName();
        name.getClass();
        return name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn8)) {
            return false;
        }
        return toString().equals(((gn8) obj).toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String file = this.a.toString();
        file.getClass();
        return file;
    }
}
