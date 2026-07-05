package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gqa  reason: default package */
/* loaded from: classes.dex */
public final class gqa implements rb7 {
    public final ArrayList a;

    public gqa(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((fqa) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((fqa) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((fqa) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        wq9.s(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gqa.class == obj.getClass()) {
            return this.a.equals(((gqa) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
