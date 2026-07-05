package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lc7  reason: default package */
/* loaded from: classes.dex */
public abstract class lc7 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        vf9 g;
        int a2;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1354451219:
                if (str.equals("application/vnd.dvb.ait")) {
                    c = 1;
                    break;
                }
                break;
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    c = 2;
                    break;
                }
                break;
            case -1265048566:
                if (str.equals("application/x-camera-motion")) {
                    c = 3;
                    break;
                }
                break;
            case -1248341703:
                if (str.equals("application/id3")) {
                    c = 4;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 5;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 6;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 7;
                    break;
                }
                break;
            case -43764892:
                if (str.equals("application/meta")) {
                    c = '\b';
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = '\t';
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = '\n';
                    break;
                }
                break;
            case 469933706:
                if (str.equals("application/x-media3-cues")) {
                    c = 11;
                    break;
                }
                break;
            case 1054472807:
                if (str.equals("application/x-itut-t35")) {
                    c = '\f';
                    break;
                }
                break;
            case 1154383568:
                if (str.equals("application/x-emsg")) {
                    c = '\r';
                    break;
                }
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                    c = 14;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 15;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 16;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 17;
                    break;
                }
                break;
            case 1652648887:
                if (str.equals("application/x-scte35")) {
                    c = 18;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 19;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 20;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return true;
            case 7:
                if (str2 == null || (g = g(str2)) == null || (a2 = g.a()) == 0 || a2 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : a2d.b0(str)) {
            String e = e(str2);
            if (e != null && k(e)) {
                return e;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str != null && str2 != null) {
            String[] b0 = a2d.b0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : b0) {
                if (str2.equals(e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int d(String str, String str2) {
        vf9 g;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 5;
                    break;
                }
                break;
            case 187081724:
                if (str.equals("audio/dsd")) {
                    c = 6;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c = 7;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = '\b';
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = '\t';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = '\n';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 11;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (g = g(str2)) == null) {
                    return 0;
                }
                return g.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 31;
            case 7:
                return 30;
            case '\b':
                return 6;
            case '\t':
                return 9;
            case '\n':
                return 20;
            case 11:
                return 8;
            case '\f':
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        vf9 g;
        String str2 = null;
        if (str != null) {
            String B = kve.B(str.trim());
            if (!B.startsWith("avc1") && !B.startsWith("avc3")) {
                if (!B.startsWith("hev1") && !B.startsWith("hvc1")) {
                    if (!B.startsWith("vvc1") && !B.startsWith("vvi1")) {
                        if (!B.startsWith("dvav") && !B.startsWith("dva1") && !B.startsWith("dvhe") && !B.startsWith("dvh1") && !B.startsWith("dav1")) {
                            if (B.startsWith("av01")) {
                                return "video/av01";
                            }
                            if (!B.startsWith("vp9") && !B.startsWith("vp09")) {
                                if (!B.startsWith("vp8") && !B.startsWith("vp08")) {
                                    if (B.startsWith("mp4a")) {
                                        if (B.startsWith("mp4a.") && (g = g(B)) != null) {
                                            str2 = f(g.b);
                                        }
                                        if (str2 == null) {
                                            return "audio/mp4a-latm";
                                        }
                                        return str2;
                                    } else if (B.startsWith("mha1")) {
                                        return "audio/mha1";
                                    } else {
                                        if (B.startsWith("mhm1")) {
                                            return "audio/mhm1";
                                        }
                                        if (!B.startsWith("ac-3") && !B.startsWith("dac3")) {
                                            if (!B.startsWith("ec-3") && !B.startsWith("dec3")) {
                                                if (B.startsWith("ec+3")) {
                                                    return "audio/eac3-joc";
                                                }
                                                if (!B.startsWith("ac-4") && !B.startsWith("dac4")) {
                                                    if (B.startsWith("dtsc")) {
                                                        return "audio/vnd.dts";
                                                    }
                                                    if (B.startsWith("dtse")) {
                                                        return "audio/vnd.dts.hd;profile=lbr";
                                                    }
                                                    if (!B.startsWith("dtsh") && !B.startsWith("dtsl")) {
                                                        if (B.startsWith("dtsx")) {
                                                            return "audio/vnd.dts.uhd;profile=p2";
                                                        }
                                                        if (B.startsWith("opus")) {
                                                            return "audio/opus";
                                                        }
                                                        if (B.startsWith("vorbis")) {
                                                            return "audio/vorbis";
                                                        }
                                                        if (B.startsWith("flac")) {
                                                            return "audio/flac";
                                                        }
                                                        if (B.startsWith("stpp")) {
                                                            return "application/ttml+xml";
                                                        }
                                                        if (B.startsWith("wvtt")) {
                                                            return "text/vtt";
                                                        }
                                                        if (B.contains("cea708")) {
                                                            return "application/cea-708";
                                                        }
                                                        if (!B.contains("eia608") && !B.contains("cea608")) {
                                                            ArrayList arrayList = a;
                                                            if (arrayList.size() > 0) {
                                                                arrayList.get(0).getClass();
                                                                vm1.h();
                                                                return null;
                                                            }
                                                        } else {
                                                            return "application/cea-608";
                                                        }
                                                    } else {
                                                        return "audio/vnd.dts.hd";
                                                    }
                                                } else {
                                                    return "audio/ac4";
                                                }
                                            } else {
                                                return "audio/eac3";
                                            }
                                        } else {
                                            return "audio/ac3";
                                        }
                                    }
                                } else {
                                    return "video/x-vnd.on2.vp8";
                                }
                            } else {
                                return "video/x-vnd.on2.vp9";
                            }
                        } else {
                            return "video/dolby-vision";
                        }
                    } else {
                        return "video/vvc";
                    }
                } else {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return null;
    }

    public static String f(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 221) {
                                    if (i != 165) {
                                        if (i != 166) {
                                            switch (i) {
                                                case Token.LP /* 96 */:
                                                case Token.RP /* 97 */:
                                                case Token.COMMA /* 98 */:
                                                case 99:
                                                case 100:
                                                case 101:
                                                    return "video/mpeg2";
                                                case 102:
                                                case Token.ASSIGN_BITAND /* 103 */:
                                                case Token.ASSIGN_LOGICAL_AND /* 104 */:
                                                    return "audio/mp4a-latm";
                                                case Token.ASSIGN_LSH /* 105 */:
                                                case Token.ASSIGN_URSH /* 107 */:
                                                    return "audio/mpeg";
                                                case Token.ASSIGN_RSH /* 106 */:
                                                    return "video/mpeg";
                                                case Token.ASSIGN_ADD /* 108 */:
                                                    return "image/jpeg";
                                                default:
                                                    switch (i) {
                                                        case Token.SETCONST /* 169 */:
                                                        case Token.LETEXPR /* 172 */:
                                                            return "audio/vnd.dts";
                                                        case 170:
                                                        case Token.ARRAYCOMP /* 171 */:
                                                            return "audio/vnd.dts.hd";
                                                        case Token.WITHEXPR /* 173 */:
                                                            return "audio/opus";
                                                        case Token.DEBUGGER /* 174 */:
                                                            return "audio/ac4";
                                                        default:
                                                            return null;
                                                    }
                                            }
                                        }
                                        return "audio/eac3";
                                    }
                                    return "audio/ac3";
                                }
                                return "audio/vorbis";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    public static vf9 g(String str) {
        int i;
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            try {
                int parseInt = Integer.parseInt(group, 16);
                if (group2 != null) {
                    i = Integer.parseInt(group2);
                } else {
                    i = 0;
                }
                return new vf9(parseInt, i, 7);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int i(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (k(str)) {
                return 1;
            }
            if (o(str)) {
                return 2;
            }
            if (n(str)) {
                return 3;
            }
            if (m(str)) {
                return 4;
            }
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str) && !"application/meta".equals(str) && !"application/x-itut-t35".equals(str)) {
                if ("application/x-camera-motion".equals(str)) {
                    return 6;
                }
                ArrayList arrayList = a;
                if (arrayList.size() <= 0) {
                    return -1;
                }
                arrayList.get(0).getClass();
                vm1.h();
                return 0;
            }
            return 5;
        }
        return -1;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : a2d.b0(str)) {
            String e = e(str2);
            if (e != null && o(e)) {
                return e;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean l(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        if ((!str2.startsWith("dvhe") || !str.startsWith("hev1")) && ((!str2.startsWith("dvh1") || !str.startsWith("hvc1")) && ((!str2.startsWith("dvav") || !str.startsWith("avc3")) && ((!str2.startsWith("dva1") || !str.startsWith("avc1")) && (!str2.startsWith("dav1") || !str.startsWith("av01")))))) {
            return false;
        }
        return true;
    }

    public static boolean m(String str) {
        if (!"image".equals(h(str)) && !"application/x-image-uri".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean n(String str) {
        if (!"text".equals(h(str)) && !"application/x-media3-cues".equals(str) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean o(String str) {
        return "video".equals(h(str));
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        String B = kve.B(str);
        B.getClass();
        char c = 65535;
        switch (B.hashCode()) {
            case -1833600100:
                if (B.equals("video/x-mvhevc")) {
                    c = 0;
                    break;
                }
                break;
            case -1007807498:
                if (B.equals("audio/x-flac")) {
                    c = 1;
                    break;
                }
                break;
            case -979095690:
                if (B.equals("application/x-mpegurl")) {
                    c = 2;
                    break;
                }
                break;
            case -586683234:
                if (B.equals("audio/x-wav")) {
                    c = 3;
                    break;
                }
                break;
            case -432836268:
                if (B.equals("audio/mpeg-l1")) {
                    c = 4;
                    break;
                }
                break;
            case -432836267:
                if (B.equals("audio/mpeg-l2")) {
                    c = 5;
                    break;
                }
                break;
            case 187090231:
                if (B.equals("audio/mp3")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "video/mv-hevc";
            case 1:
                return "audio/flac";
            case 2:
                return "application/x-mpegURL";
            case 3:
                return "audio/wav";
            case 4:
                return "audio/mpeg-L1";
            case 5:
                return "audio/mpeg-L2";
            case 6:
                return "audio/mpeg";
            default:
                return B;
        }
    }
}
