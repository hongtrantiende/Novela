package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: myd  reason: default package */
/* loaded from: classes.dex */
public final class myd {
    public static final roa b = new roa(22);
    public static final myd c;
    public final lyd a;

    static {
        List list = Collections.EMPTY_LIST;
        c = new myd(new lyd());
    }

    public myd(lyd lydVar) {
        this.a = lydVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof myd) && ((myd) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
