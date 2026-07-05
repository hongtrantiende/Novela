package okhttp3.internal.http;

import okhttp3.Interceptor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class CallServerInterceptor implements Interceptor {
    public static final CallServerInterceptor a = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:108:0x021a, code lost:
        if ("close".equalsIgnoreCase(r5) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
        if (r0.c() == false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020c A[Catch: IOException -> 0x0132, TryCatch #5 {IOException -> 0x0132, blocks: (B:61:0x011d, B:63:0x0126, B:66:0x0135, B:74:0x015a, B:76:0x0163, B:77:0x016c, B:78:0x0185, B:83:0x0197, B:89:0x01a5, B:90:0x01ac, B:92:0x01af, B:95:0x01b9, B:100:0x01c4, B:102:0x01fb, B:104:0x020c, B:107:0x0216, B:114:0x022d, B:117:0x023a, B:118:0x025e, B:109:0x021c, B:101:0x01e6), top: B:133:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163 A[Catch: IOException -> 0x0132, TryCatch #5 {IOException -> 0x0132, blocks: (B:61:0x011d, B:63:0x0126, B:66:0x0135, B:74:0x015a, B:76:0x0163, B:77:0x016c, B:78:0x0185, B:83:0x0197, B:89:0x01a5, B:90:0x01ac, B:92:0x01af, B:95:0x01b9, B:100:0x01c4, B:102:0x01fb, B:104:0x020c, B:107:0x0216, B:114:0x022d, B:117:0x023a, B:118:0x025e, B:109:0x021c, B:101:0x01e6), top: B:133:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0197 A[Catch: IOException -> 0x0132, TryCatch #5 {IOException -> 0x0132, blocks: (B:61:0x011d, B:63:0x0126, B:66:0x0135, B:74:0x015a, B:76:0x0163, B:77:0x016c, B:78:0x0185, B:83:0x0197, B:89:0x01a5, B:90:0x01ac, B:92:0x01af, B:95:0x01b9, B:100:0x01c4, B:102:0x01fb, B:104:0x020c, B:107:0x0216, B:114:0x022d, B:117:0x023a, B:118:0x025e, B:109:0x021c, B:101:0x01e6), top: B:133:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01af A[Catch: IOException -> 0x0132, TryCatch #5 {IOException -> 0x0132, blocks: (B:61:0x011d, B:63:0x0126, B:66:0x0135, B:74:0x015a, B:76:0x0163, B:77:0x016c, B:78:0x0185, B:83:0x0197, B:89:0x01a5, B:90:0x01ac, B:92:0x01af, B:95:0x01b9, B:100:0x01c4, B:102:0x01fb, B:104:0x020c, B:107:0x0216, B:114:0x022d, B:117:0x023a, B:118:0x025e, B:109:0x021c, B:101:0x01e6), top: B:133:0x011d }] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, okhttp3.TrailersSource] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response o(okhttp3.internal.http.RealInterceptorChain r22) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.o(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }
}
