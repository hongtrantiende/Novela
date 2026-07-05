package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c0a  reason: default package */
/* loaded from: classes.dex */
public final class c0a {
    public final ArrayList a;
    public final ArrayList b;
    public final wz9 c;
    public final ArrayList d;

    public c0a(ArrayList arrayList, ArrayList arrayList2, wz9 wz9Var, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = wz9Var;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && c0a.class == obj.getClass()) {
                c0a c0aVar = (c0a) obj;
                if (this.a.equals(c0aVar.a) && this.b.equals(c0aVar.b) && c16.i(this.c, c0aVar.c) && this.d.equals(c0aVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + hashCode;
    }

    public final String toString() {
        return "SceneState(entries=" + this.a + ", overlayScenes=" + this.b + ", currentScene=" + this.c + ", previousScenes=" + this.d + ")";
    }
}
