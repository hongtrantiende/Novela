package okhttp3.internal.http;

import okhttp3.Protocol;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class StatusLine {
    public final Protocol a;
    public final int b;
    public final String c;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static okhttp3.internal.http.StatusLine a(java.lang.String r8) {
            /*
                java.lang.String r0 = "HTTP/1."
                r1 = 0
                boolean r0 = defpackage.r4b.Q(r8, r0, r1)
                okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_0
                okhttp3.Protocol r3 = okhttp3.Protocol.HTTP_1_1
                r4 = 4
                r5 = 32
                java.lang.String r6 = "Unexpected status line: "
                if (r0 == 0) goto L43
                int r0 = r8.length()
                r1 = 9
                if (r0 < r1) goto L39
                r0 = 8
                char r0 = r8.charAt(r0)
                if (r0 != r5) goto L39
                r0 = 7
                char r0 = r8.charAt(r0)
                int r0 = r0 + (-48)
                if (r0 == 0) goto L58
                r2 = 1
                if (r0 != r2) goto L2f
                goto L57
            L2f:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = r6.concat(r8)
                r0.<init>(r8)
                throw r0
            L39:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = r6.concat(r8)
                r0.<init>(r8)
                throw r0
            L43:
                java.lang.String r0 = "ICY "
                boolean r0 = defpackage.r4b.Q(r8, r0, r1)
                if (r0 == 0) goto L4d
                r1 = r4
                goto L58
            L4d:
                java.lang.String r0 = "SOURCETABLE "
                boolean r0 = defpackage.r4b.Q(r8, r0, r1)
                if (r0 == 0) goto La8
                r1 = 12
            L57:
                r2 = r3
            L58:
                int r0 = r8.length()
                int r3 = r1 + 3
                if (r0 < r3) goto L9e
                java.lang.String r0 = r8.substring(r1, r3)
                r7 = 10
                java.lang.Integer r0 = defpackage.r4b.R(r7, r0)
                if (r0 == 0) goto L94
                int r0 = r0.intValue()
                int r7 = r8.length()
                if (r7 <= r3) goto L8c
                char r3 = r8.charAt(r3)
                if (r3 != r5) goto L82
                int r1 = r1 + r4
                java.lang.String r8 = r8.substring(r1)
                goto L8e
            L82:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = r6.concat(r8)
                r0.<init>(r8)
                throw r0
            L8c:
                java.lang.String r8 = ""
            L8e:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine
                r1.<init>(r2, r0, r8)
                return r1
            L94:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = r6.concat(r8)
                r0.<init>(r8)
                throw r0
            L9e:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = r6.concat(r8)
                r0.<init>(r8)
                throw r0
            La8:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = r6.concat(r8)
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.StatusLine.Companion.a(java.lang.String):okhttp3.internal.http.StatusLine");
        }
    }

    public StatusLine(Protocol protocol, int i, String str) {
        protocol.getClass();
        str.getClass();
        this.a = protocol;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
