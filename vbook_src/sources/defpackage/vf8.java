package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vf8  reason: default package */
/* loaded from: classes3.dex */
public final class vf8 {
    public final String a;
    public final int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Set f;
    public final ArrayList g;
    public final Set h;
    public final List i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;

    public vf8(String str, int i, boolean z, ArrayList arrayList, ArrayList arrayList2, Set set, ArrayList arrayList3, Set set2, List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = set;
        this.g = arrayList3;
        this.h = set2;
        this.i = list;
        this.j = linkedHashMap;
        this.k = linkedHashMap2;
        this.l = linkedHashMap3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vf8) {
                vf8 vf8Var = (vf8) obj;
                if (!c16.i(this.a, vf8Var.a) || this.b != vf8Var.b || this.c != vf8Var.c || !this.d.equals(vf8Var.d) || !this.e.equals(vf8Var.e) || !this.f.equals(vf8Var.f) || !this.g.equals(vf8Var.g) || !this.h.equals(vf8Var.h) || !this.i.equals(vf8Var.i) || !this.j.equals(vf8Var.j) || !this.k.equals(vf8Var.k) || !this.l.equals(vf8Var.l)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int k = eub.k(hl5.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        int hashCode = this.e.hashCode();
        int b = s21.b(this.f, (hashCode + ((this.d.hashCode() + k) * 31)) * 31, 31);
        int l = eub.l(s21.b(this.h, (this.g.hashCode() + b) * 31, 31), this.i, 31);
        int hashCode2 = this.k.hashCode();
        return this.l.hashCode() + ((hashCode2 + ((this.j.hashCode() + l) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("OutlineDragPayload(primaryRootId=", pm0.a(this.a), ", primaryRootIndex=", this.b, ", primaryRootSupportsIndentation=");
        s.append(this.c);
        s.append(", dragRootIds=");
        s.append(this.d);
        s.append(", payloadBlockIds=");
        s.append(this.e);
        s.append(", payloadBlockIdSet=");
        s.append(this.f);
        s.append(", payloadBlockIndices=");
        s.append(this.g);
        s.append(", payloadBlockIndexSet=");
        s.append(this.h);
        s.append(", payloadIndexRanges=");
        s.append(this.i);
        s.append(", originalRootIndentationLevels=");
        s.append(this.j);
        s.append(", payloadRelativeDepthOffsets=");
        s.append(this.k);
        s.append(", payloadRootIdsByBlockId=");
        s.append(this.l);
        s.append(")");
        return s.toString();
    }
}
