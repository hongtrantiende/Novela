package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u04  reason: default package */
/* loaded from: classes.dex */
public final class u04 implements az8 {
    public final /* synthetic */ x04 a;

    public u04(x04 x04Var) {
        this.a = x04Var;
    }

    @Override // defpackage.az8
    public final void B(my8 my8Var) {
        my8Var.getClass();
        cza czaVar = this.a.I.b;
        Float valueOf = Float.valueOf(my8Var.a);
        czaVar.getClass();
        czaVar.n(null, valueOf);
    }

    @Override // defpackage.az8
    public final void E(f57 f57Var, int i) {
        x04 x04Var = this.a;
        cza czaVar = x04Var.b;
        if (f57Var != null && ((py8) czaVar.getValue()).compareTo(py8.d) > 0) {
            czaVar.getClass();
            czaVar.n(null, py8.e);
            cza czaVar2 = (cza) x04Var.G.a;
            Boolean bool = Boolean.FALSE;
            czaVar2.getClass();
            czaVar2.n(null, bool);
        }
    }

    @Override // defpackage.az8
    public final void H(boolean z) {
        x04.o(this.a);
    }

    @Override // defpackage.az8
    public final void a(uad uadVar) {
        uadVar.getClass();
        d();
    }

    public final void d() {
        String str;
        x04 x04Var = this.a;
        i04 i04Var = x04Var.E;
        i04Var.X();
        if (i04Var.T != null) {
            i04Var.X();
            if (i04Var.U == null) {
                return;
            }
            i04Var.X();
            CharSequence charSequence = i04Var.S.a;
            long p = i04Var.p();
            cza czaVar = x04Var.F;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            r57 r57Var = new r57(str, p);
            czaVar.getClass();
            czaVar.n(null, r57Var);
        }
    }

    @Override // defpackage.az8
    public final void l(int i) {
        x04.o(this.a);
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [ks3] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    @Override // defpackage.az8
    public final void q(tjc tjcVar) {
        List list;
        tjcVar.getClass();
        qs5 qs5Var = tjcVar.a;
        qs5Var.getClass();
        ff4 ff4Var = new ff4(new c00(qs5Var, 1), true, new dw3(8));
        x04 x04Var = this.a;
        sz3 sz3Var = x04Var.H;
        pg2 pg2Var = new pg2(x04Var, 19);
        l9a l9aVar = l9a.a;
        c9a O = h9a.O(new i9a(ff4Var, pg2Var, null));
        boolean hasNext = O.hasNext();
        Object obj = ks3.a;
        if (!hasNext) {
            list = obj;
        } else {
            Object next = O.next();
            if (!O.hasNext()) {
                list = tl1.A(next);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (O.hasNext()) {
                    arrayList.add(O.next());
                }
                list = arrayList;
            }
        }
        if (!list.equals(((cza) ((s26) sz3Var.a).c).getValue())) {
            cza czaVar = (cza) ((s26) sz3Var.a).c;
            czaVar.getClass();
            czaVar.n(null, list);
            ((cza) ((s26) sz3Var.a).b).m(sl1.e0(list));
        }
        cza czaVar2 = (cza) ((s26) sz3Var.b).c;
        c9a O2 = h9a.O(new i9a(new ff4(new c00(qs5Var, 1), true, new dw3(9)), new pg2(x04Var, 20), null));
        if (O2.hasNext()) {
            Object next2 = O2.next();
            if (!O2.hasNext()) {
                obj = tl1.A(next2);
            } else {
                obj = new ArrayList();
                obj.add(next2);
                while (O2.hasNext()) {
                    obj.add(O2.next());
                }
            }
        }
        czaVar2.getClass();
        czaVar2.n(null, obj);
    }

    @Override // defpackage.az8
    public final void w(pz3 pz3Var) {
        String str;
        pz3Var.getClass();
        cza czaVar = this.a.b;
        if (czaVar.getValue() == py8.a) {
            return;
        }
        czaVar.getClass();
        czaVar.n(null, py8.b);
        int i = pz3Var.a;
        if (i != -100) {
            if (i != -6) {
                if (i != -4) {
                    if (i != -3) {
                        if (i != -2) {
                            if (i != 7000) {
                                if (i != 7001) {
                                    switch (i) {
                                        case -110:
                                            str = "ERROR_CODE_CONTENT_ALREADY_PLAYING";
                                            break;
                                        case -109:
                                            str = "ERROR_CODE_END_OF_PLAYLIST";
                                            break;
                                        case -108:
                                            str = "ERROR_CODE_SETUP_REQUIRED";
                                            break;
                                        case -107:
                                            str = "ERROR_CODE_SKIP_LIMIT_REACHED";
                                            break;
                                        case -106:
                                            str = "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
                                            break;
                                        case -105:
                                            str = "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
                                            break;
                                        case -104:
                                            str = "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
                                            break;
                                        case -103:
                                            str = "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
                                            break;
                                        case -102:
                                            str = "ERROR_CODE_AUTHENTICATION_EXPIRED";
                                            break;
                                        default:
                                            switch (i) {
                                                case 1000:
                                                    str = "ERROR_CODE_UNSPECIFIED";
                                                    break;
                                                case 1001:
                                                    str = "ERROR_CODE_REMOTE_ERROR";
                                                    break;
                                                case 1002:
                                                    str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                                                    break;
                                                case 1003:
                                                    str = "ERROR_CODE_TIMEOUT";
                                                    break;
                                                case 1004:
                                                    str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 2000:
                                                            str = "ERROR_CODE_IO_UNSPECIFIED";
                                                            break;
                                                        case 2001:
                                                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                                            break;
                                                        case 2002:
                                                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                                            break;
                                                        case 2003:
                                                            str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                                            break;
                                                        case 2004:
                                                            str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                                            break;
                                                        case 2005:
                                                            str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                                            break;
                                                        case 2006:
                                                            str = "ERROR_CODE_IO_NO_PERMISSION";
                                                            break;
                                                        case 2007:
                                                            str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                                            break;
                                                        case 2008:
                                                            str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 3001:
                                                                    str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                                                    break;
                                                                case 3002:
                                                                    str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                                                    break;
                                                                case 3003:
                                                                    str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                                                    break;
                                                                case 3004:
                                                                    str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 4001:
                                                                            str = "ERROR_CODE_DECODER_INIT_FAILED";
                                                                            break;
                                                                        case 4002:
                                                                            str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                                            break;
                                                                        case 4003:
                                                                            str = "ERROR_CODE_DECODING_FAILED";
                                                                            break;
                                                                        case 4004:
                                                                            str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                                            break;
                                                                        case 4005:
                                                                            str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                                            break;
                                                                        case 4006:
                                                                            str = "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                                                            break;
                                                                        default:
                                                                            switch (i) {
                                                                                case 5001:
                                                                                    str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                                                    break;
                                                                                case 5002:
                                                                                    str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                                                    break;
                                                                                case 5003:
                                                                                    str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                                                    break;
                                                                                case 5004:
                                                                                    str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                                                    break;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 6000:
                                                                                            str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                                                            break;
                                                                                        case 6001:
                                                                                            str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                                                            break;
                                                                                        case 6002:
                                                                                            str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                                                            break;
                                                                                        case 6003:
                                                                                            str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                                                            break;
                                                                                        case 6004:
                                                                                            str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                                                            break;
                                                                                        case 6005:
                                                                                            str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                                                            break;
                                                                                        case 6006:
                                                                                            str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                                                            break;
                                                                                        case 6007:
                                                                                            str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                                                            break;
                                                                                        case 6008:
                                                                                            str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                                                            break;
                                                                                        default:
                                                                                            if (i >= 1000000) {
                                                                                                str = "custom error code";
                                                                                                break;
                                                                                            } else {
                                                                                                str = "invalid error code";
                                                                                                break;
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                } else {
                                    str = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
                                }
                            } else {
                                str = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
                            }
                        } else {
                            str = "ERROR_CODE_INVALID_STATE";
                        }
                    } else {
                        str = "ERROR_CODE_BAD_VALUE";
                    }
                } else {
                    str = "ERROR_CODE_PERMISSION_DENIED";
                }
            } else {
                str = "ERROR_CODE_NOT_SUPPORTED";
            }
        } else {
            str = "ERROR_CODE_DISCONNECTED";
        }
        System.out.println((Object) "ExoPlayer error: ".concat(str));
        pz3Var.printStackTrace();
    }
}
