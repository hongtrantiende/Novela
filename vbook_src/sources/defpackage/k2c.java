package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k2c  reason: default package */
/* loaded from: classes3.dex */
public final class k2c {
    public final String a;
    public final List b;

    public k2c(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static k2c a(k2c k2cVar, String str, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            str = k2cVar.a;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = k2cVar.b;
        }
        k2cVar.getClass();
        arrayList2.getClass();
        return new k2c(str, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k2c) {
                k2c k2cVar = (k2c) obj;
                if (!this.a.equals(k2cVar.a) || !c16.i(this.b, k2cVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextToSpeechTableOfContentState(currentId=" + this.a + ", tocLinks=" + this.b + ")";
    }
}
