package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ff2  reason: default package */
/* loaded from: classes.dex */
public final class ff2 implements df4 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final k53 i;
    public final a57 j;
    public final Uri k;
    public final f79 l;
    public final List m;

    public ff2(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, f79 f79Var, k53 k53Var, a57 a57Var, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = f79Var;
        this.i = k53Var;
        this.k = uri;
        this.j = a57Var;
        this.m = arrayList;
    }

    @Override // defpackage.df4
    public final Object a(List list) {
        long j;
        long j2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new h1b());
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        int i = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i >= this.m.size()) {
                break;
            }
            if (((h1b) linkedList.peek()).a != i) {
                long c = c(i);
                if (c != -9223372036854775807L) {
                    j3 += c;
                }
            } else {
                mt8 b = b(i);
                List list2 = b.c;
                h1b h1bVar = (h1b) linkedList.poll();
                int i2 = h1bVar.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = h1bVar.b;
                    g7 g7Var = (g7) list2.get(i3);
                    List list3 = g7Var.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((tp9) list3.get(h1bVar.c));
                        h1bVar = (h1b) linkedList.poll();
                        if (h1bVar.a != i2) {
                            break;
                        }
                    } while (h1bVar.b == i3);
                    j2 = j3;
                    arrayList2.add(new g7(g7Var.a, g7Var.b, arrayList3, g7Var.d, g7Var.e, g7Var.f));
                    if (h1bVar.a != i2) {
                        break;
                    }
                    j3 = j2;
                }
                linkedList.addFirst(h1bVar);
                arrayList.add(new mt8(b.a, b.b - j2, arrayList2, b.d));
                j3 = j2;
            }
            i++;
        }
        long j4 = j3;
        long j5 = this.b;
        if (j5 != -9223372036854775807L) {
            j = j5 - j4;
        }
        a57 a57Var = this.j;
        Uri uri = this.k;
        return new ff2(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, a57Var, uri, arrayList);
    }

    public final mt8 b(int i) {
        return (mt8) this.m.get(i);
    }

    public final long c(int i) {
        long j;
        long j2;
        List list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((mt8) list.get(i)).b;
        } else {
            j = ((mt8) list.get(i + 1)).b;
            j2 = ((mt8) list.get(i)).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return a2d.Q(c(i));
    }
}
