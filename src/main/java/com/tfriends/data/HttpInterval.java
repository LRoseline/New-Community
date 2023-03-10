package com.tfriends.data;

public class HttpInterval {
    public String codMessage(int cod) {
        String message = "OK";

        switch (cod) {
            case 100:
                message = "Continue";
                break;
            case 101:
                message = "Switching protocols";
                break;
            case 102:
                message = "Processing";
                break;
            case 103:
                message = "Early hints";
                break;
            case 200:
                message = "OK";
                break;
            case 201:
                message = "Created";
                break;
            case 202:
                message = "Accepted";
                break;
            case 203:
                message = "Non-Authoritative information";
                break;
            case 204:
                message = "No content";
                break;
            case 206:
                message = "Partial content";
                break;
            case 207:
                message = "Multi status";
                break;
            case 300:
                message = "Multiple choices";
                break;
            case 301:
                message = "Moved permanently";
                break;
            case 302:
                message = "Found";
                break;
            case 303:
                message = "See other";
                break;
            case 304:
                message = "Not modified";
                break;
            case 305:
                message = "Use proxy";
                break;
            case 307:
                message = "Temporary redirect";
                break;
            case 308:
                message = "Permanent redirect";
                break;
            case 400:
                message = "Bad request";
                break;
            case 401:
                message = "Unauthorized";
                break;
            case 402:
                message = "Payment required";
                break;
            case 403:
                message = "Forbidden";
                break;
            case 404:
                message = "Not found";
                break;
            case 405:
                message = "Method not allowed";
                break;
            case 406:
                message = "Not acceptable";
                break;
            case 407:
                message = "Proxy authentication required";
                break;
            case 408:
                message = "Request timeout";
                break;
            case 409:
                message = "conflict";
                break;
            case 410:
                message = "Gone";
                break;
            case 411:
                message = "Length required";
                break;
            case 412:
                message = "Precondition failed";
                break;
            case 413:
                message = "Payload too large";
                break;
            case 414:
                message = "Request-URI too long";
                break;
            case 415:
                message = "Unsupported media type";
                break;
            case 416:
                message = "Request range not satisfiable";
                break;
            case 417:
                message = "Expectation failed";
                break;
            case 418:
                message = "teapot";
                break;
            case 420:
                message = "Enhance your calm";
                break;
            case 421:
                message = "Misdirected request";
                break;
            case 422:
                message = "Unprocessable entity";
                break;
            case 423:
                message = "Locked";
                break;
            case 424:
                message = "Failed dependency";
                break;
            case 425:
                message = "Too early";
                break;
            case 426:
                message = "Upgrade required";
                break;
            case 429:
                message = "Too many requests";
                break;
            case 431:
                message = "Request header fields too large";
                break;
            case 444:
                message = "No response";
                break;
            case 450:
                message = "Blocked by windows parental controls";
                break;
            case 451:
                message = "Unavaliable for legal reasons";
                break;
            case 497:
                message = "HTTP request sent to https port";
                break;
            case 498:
                message = "Token expired or invalid";
                break;
            case 499:
                message = "Client closed request";
                break;
            case 500:
                message = "Internal server error";
                break;
            case 501:
                message = "Not implemented";
                break;
            case 502:
                message = "Bad gateway";
                break;
            case 503:
                message = "Service unavaliable";
                break;
            case 504:
                message = "Gateway timeout";
                break;
            case 506:
                message = "Variant also negotiates";
                break;
            case 507:
                message = "Insufficient storage";
                break;
            case 508:
                message = "Loop detected";
                break;
            case 509:
                message = "Bandwidth limit exceeded";
                break;
            case 510:
                message = "Not extended";
                break;
            case 511:
                message = "Network authentication required";
                break;
            case 521:
                message = "Web server is down";
                break;
            case 522:
                message = "Connection timed out";
                break;
            case 523:
                message = "Origin is Unreachable";
                break;
            case 525:
                message = "SSL handshake failed";
                break;
            case 599:
                message = "Network connect timeout error";
                break;
            default:
                message = "Other problem. We can not find it.";
                break;
        }
        return message;
    }
}
