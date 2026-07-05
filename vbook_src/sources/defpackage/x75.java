package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x75  reason: default package */
/* loaded from: classes.dex */
public final class x75 implements an8 {
    public final u75 a;
    public final q75 b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern C = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern D = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern F = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern G = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern H = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern I = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern J = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern K = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern L = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern O = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern P = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern Q = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern R = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern S = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern T = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern U = a("CAN-SKIP-DATERANGES");
    public static final Pattern V = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern W = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern X = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern Y = a("CAN-BLOCK-RELOAD");
    public static final Pattern Z = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern a0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern b0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern c0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern d0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern e0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern f0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern g0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern h0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern i0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern j0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern k0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern l0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern n0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern o0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern p0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern q0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern s0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern t0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern v0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern w0 = a("AUTOSELECT");
    public static final Pattern x0 = a("DEFAULT");
    public static final Pattern y0 = a("FORCED");
    public static final Pattern z0 = a("INDEPENDENT");
    public static final Pattern A0 = a("GAP");
    public static final Pattern B0 = a("PRECISE");
    public static final Pattern C0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern D0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern E0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern F0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern G0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern J0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern K0 = a("END-ON-NEXT");
    public static final Pattern L0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern M0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern N0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern O0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern P0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern Q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern R0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern S0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern T0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern U0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern V0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern W0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern X0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern Y0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public x75(u75 u75Var, q75 q75Var) {
        this.a = u75Var;
        this.b = q75Var;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static zk3 b(String str, yk3[] yk3VarArr) {
        yk3[] yk3VarArr2 = new yk3[yk3VarArr.length];
        for (int i = 0; i < yk3VarArr.length; i++) {
            yk3 yk3Var = yk3VarArr[i];
            yk3VarArr2[i] = new yk3(yk3Var.b, yk3Var.c, yk3Var.d, null);
        }
        return new zk3(str, true, yk3VarArr2);
    }

    public static yk3 c(String str, String str2, HashMap hashMap, tt4 tt4Var) {
        String i = i(str, l0, "1", hashMap, tt4Var);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = m0;
        if (equals) {
            String j = j(str, pattern, hashMap, tt4Var);
            return new yk3(h31.d, null, "video/mp4", Base64.decode(j.substring(j.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = h31.d;
            String str3 = a2d.a;
            return new yk3(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i)) {
            return null;
        } else {
            String j2 = j(str, pattern, hashMap, tt4Var);
            byte[] decode = Base64.decode(j2.substring(j2.indexOf(44)), 0);
            UUID uuid2 = h31.e;
            return new yk3(uuid2, null, "video/mp4", hbe.b0(uuid2, null, decode));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -115
        	at java.base/java.util.BitSet.get(BitSet.java:626)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:55)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public static defpackage.q75 d(defpackage.u75 r140, defpackage.q75 r141, defpackage.zg4 r142, android.net.Uri r143, defpackage.tt4 r144) {
        /*
            Method dump skipped, instructions count: 4794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x75.d(u75, q75, zg4, android.net.Uri, tt4):q75");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0216  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [int] */
    /* JADX WARN: Type inference failed for: r5v74 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.u75 e(defpackage.zg4 r48, android.net.Uri r49, defpackage.tt4 r50) {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x75.e(zg4, android.net.Uri, tt4):u75");
    }

    public static boolean f(tt4 tt4Var, String str, Pattern pattern) {
        Matcher a = tt4.a(tt4Var, str, pattern);
        if (a.find()) {
            return "YES".equals(a.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d2, tt4 tt4Var) {
        Matcher a = tt4.a(tt4Var, str, pattern);
        if (a.find()) {
            String group = a.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return d2;
    }

    public static long h(tt4 tt4Var, String str, Pattern pattern) {
        Matcher a = tt4.a(tt4Var, str, pattern);
        if (a.find()) {
            String group = a.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String i(String str, Pattern pattern, String str2, Map map, tt4 tt4Var) {
        Matcher a = tt4.a(tt4Var, str, pattern);
        if (a.find()) {
            str2 = a.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return k(str2, map, tt4Var);
        }
        return str2;
    }

    public static String j(String str, Pattern pattern, Map map, tt4 tt4Var) {
        String i = i(str, pattern, null, map, tt4Var);
        if (i != null) {
            return i;
        }
        throw xm8.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map, tt4 tt4Var) {
        Matcher a = tt4.a(tt4Var, str, X0);
        StringBuffer stringBuffer = new StringBuffer();
        while (a.find()) {
            String group = a.group(1);
            if (map.containsKey(group)) {
                a.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        a.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void m(String str, HashMap hashMap) {
        if (!hashMap.containsKey(str)) {
            return;
        }
        throw xm8.b("duplicate variable name \"" + str + "\"", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073 A[Catch: all -> 0x009e, LOOP:0: B:32:0x0073->B:101:0x0073, LOOP_START, TryCatch #4 {all -> 0x009e, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:32:0x0073, B:34:0x0079, B:37:0x0084, B:39:0x008c, B:45:0x00a0, B:47:0x00a8, B:49:0x00b0, B:51:0x00b8, B:53:0x00c0, B:55:0x00c8, B:57:0x00d0, B:59:0x00d8, B:62:0x00e1, B:63:0x00e5, B:71:0x0107, B:72:0x010d, B:13:0x003a, B:15:0x0040, B:19:0x0049, B:22:0x0052, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:29:0x006c), top: B:88:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #4 {all -> 0x009e, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:32:0x0073, B:34:0x0079, B:37:0x0084, B:39:0x008c, B:45:0x00a0, B:47:0x00a8, B:49:0x00b0, B:51:0x00b8, B:53:0x00c0, B:55:0x00c8, B:57:0x00d0, B:59:0x00d8, B:62:0x00e1, B:63:0x00e5, B:71:0x0107, B:72:0x010d, B:13:0x003a, B:15:0x0040, B:19:0x0049, B:22:0x0052, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:29:0x006c), top: B:88:0x0019 }] */
    @Override // defpackage.an8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(android.net.Uri r8, defpackage.lg2 r9) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x75.l(android.net.Uri, lg2):java.lang.Object");
    }
}
