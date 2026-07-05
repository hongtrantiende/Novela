package defpackage;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aqe  reason: default package */
/* loaded from: classes.dex */
public final class aqe implements Runnable {
    public final /* synthetic */ c3e C;
    public final /* synthetic */ int a = 0;
    public final URL b;
    public final byte[] c;
    public final String d;
    public final Map e;
    public final Object f;

    public aqe(dqe dqeVar, String str, URL url, byte[] bArr, Map map, tpe tpeVar) {
        Objects.requireNonNull(dqeVar);
        this.C = dqeVar;
        am8.p(str);
        am8.s(url);
        this.b = url;
        this.c = bArr;
        this.f = tpeVar;
        this.d = str;
        this.e = map;
    }

    public void a(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        ete eteVar = ((lte) ((h0f) this.C).a).C;
        lte.m(eteVar);
        eteVar.g0(new Runnable() { // from class: f0f
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                aqe aqeVar = aqe.this;
                ((d0f) aqeVar.f).a(aqeVar.d, i, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017c  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqe.run():void");
    }

    public aqe(h0f h0fVar, String str, URL url, byte[] bArr, HashMap hashMap, d0f d0fVar) {
        Objects.requireNonNull(h0fVar);
        this.C = h0fVar;
        am8.p(str);
        this.b = url;
        this.c = bArr;
        this.f = d0fVar;
        this.d = str;
        this.e = hashMap;
    }
}
